package com.aureole.moons.services.impl;

import com.aureole.moons.data_entities.Book;
import com.aureole.moons.repositories.BookRepository;
import com.aureole.moons.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book){
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

//    @Override
//    public Set<Book> findAllBooks() {
//        System.out.println("coming here");
//        return  bookRepository.getAllBooks();
//    }

    @Override
    public Book findById(BigInteger id){
        System.out.println("id value:"+id);
        Optional<Book> optionalBook= bookRepository.findById(id);
        Book book = optionalBook.stream().findFirst().orElse(null);
        System.out.println("cart=========>"+book);
        return book;
    }

    /**
     * Update the cart based on new payload
     * @param id
     * @param bookPayload
     * @return
     */
    public Book update(BigInteger id, Book bookPayload){
        bookPayload.setBookId(id);
        return bookRepository.saveAndFlush(bookPayload);
    }

    /**
     *  Build a response with 204  No Content
     * @param id
     */
    public void deleteById(BigInteger id){
        bookRepository.deleteById(id);

    }

}
