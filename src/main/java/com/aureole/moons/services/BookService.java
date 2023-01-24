package com.aureole.moons.services;


import com.aureole.moons.data_entities.Book;
import com.aureole.moons.data_entities.Cart;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

public interface BookService extends BaseService{


    Book save(Book cart);
    List<Book> findAll();

//    Set<Book> findAllBooks();

    Book findById(BigInteger id);
    Book update(BigInteger id, Book cart);
    void deleteById(BigInteger id);
}
