package com.aureole.moons.controllers.rest;

import com.aureole.moons.data_entities.Author;
import com.aureole.moons.data_entities.Book;
import com.aureole.moons.response_builders.CommonResponseBuilder;
import com.aureole.moons.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@RequestMapping("/authors")
@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping()
    public Author createAuthor(@RequestBody Author author){
        return authorService.save(author);
    }

    @GetMapping()
    public List<Author> getAllAuthors(){
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity getAuthorById(@PathVariable  BigInteger id){
        System.out.println("id value:"+id);
        Author author= authorService.findById(id);
        if(author ==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(author);
    }

    @GetMapping("/{id}/books")
    public ResponseEntity getBooksAuthorById(@PathVariable  BigInteger id){
        Set<Book> books = authorService.findBooksByAuthorId(id);
        if(books ==null && books.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(books);
    }

    @PatchMapping("/{id}")
    public Author updateAuthor(@PathVariable BigInteger id, @RequestBody Author authorUpdateRequest){
        System.out.println("id==>"+id);
        System.out.println("authorUpdateRequest==>"+authorUpdateRequest);
        return authorService.update(id, authorUpdateRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCartById(@PathVariable BigInteger id){
         authorService.deleteById(id);
        return CommonResponseBuilder.build204Response();
    }

}
