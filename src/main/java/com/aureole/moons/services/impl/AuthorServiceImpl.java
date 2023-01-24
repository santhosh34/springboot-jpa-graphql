package com.aureole.moons.services.impl;

import com.aureole.moons.data_entities.Author;
import com.aureole.moons.data_entities.Book;
import com.aureole.moons.repositories.AuthorRepository;
import com.aureole.moons.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;


    @Override
    public Author save(Author author){
        return authorRepository.saveAndFlush(author);
    }



    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();

    }

    @Override
    public Set<Book> findBooksByAuthorId(BigInteger authorId) {
        return authorRepository.getBooksByAuthorId(authorId);

    }

    @Override
    public Author findById(BigInteger id){
        System.out.println("id value:"+id);
        // authorRepository.f
        Optional<Author> optionalCart= authorRepository.findById(id);
        Author author = optionalCart.stream().findFirst().orElse(null);

        System.out.println("author=========>"+author);
        return author;
    }


    /**
     * Update the cart based on new payload
     * @param id
     * @param authorPayload
     * @return
     */
    public Author update(BigInteger id, Author authorPayload){

        authorPayload.setAuthorId(id);
        return authorRepository.saveAndFlush(authorPayload);
    }

    /**
     *  Build a response with 204  No Content
     * @param id
     */
    public void deleteById(BigInteger id){
        authorRepository.deleteById(id);

    }



}
