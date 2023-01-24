package com.aureole.moons.controllers.rest;


import com.aureole.moons.data_entities.Book;
import com.aureole.moons.response_builders.CommonResponseBuilder;
import com.aureole.moons.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;


@RequestMapping("/books")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping()
    public Book createBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @GetMapping()
    public List<Book> getAllBooks(){

        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity getBookById(@PathVariable  BigInteger id){
        System.out.println("id value:"+id);
        Book book= bookService.findById(id);
        if(book ==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(book);
    }

    @PatchMapping("/{id}")
    public Book updateBook(@PathVariable BigInteger id, @RequestBody Book bookUpdateRequest){
        System.out.println("id==>"+id);
        System.out.println("bookUpdateRequest==>"+bookUpdateRequest);
        return bookService.update(id, bookUpdateRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBookById(@PathVariable BigInteger id){
         bookService.deleteById(id);
        return CommonResponseBuilder.build204Response();
    }

}
