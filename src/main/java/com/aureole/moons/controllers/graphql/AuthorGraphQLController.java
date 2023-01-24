package com.aureole.moons.controllers.graphql;

import com.aureole.moons.data_entities.Author;
import com.aureole.moons.data_entities.Book;
import com.aureole.moons.repositories.AuthorRepository;
import com.aureole.moons.repositories.BookRepository;
import com.aureole.moons.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.BatchMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class AuthorGraphQLController {

    @Autowired
    private AuthorService authorService;
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @QueryMapping
    Iterable<Author> authors(){
        return authorRepository.findAll();
    }

    @BatchMapping
    Map<Author,Set<Book>> books(Set<Author> authorSet){

        Map<Author,Set<Book>> authorBooks = new HashMap();
        authorBooks.putAll(  authorSet.stream().collect(Collectors.toMap(author -> author, author -> {
            return this.bookRepository.findByAuthor((Author) author);
        })));
        return  authorBooks;
    }

    @QueryMapping
    Iterable<Book> books(){
        return bookRepository.findAll();
    }
    // The following will create a N+1 problem...  and not a good option due to performance hit.
    //    @SchemaMapping(typeName = "Author", field = "books")
    //    Iterable<Book> getBooksByAuthor(Author author){
    //        return this.bookRepository.findByAuthor(Optional.ofNullable(author));
    //    }
    //

}
