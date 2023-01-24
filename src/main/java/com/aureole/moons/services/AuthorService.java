package com.aureole.moons.services;


import com.aureole.moons.data_entities.Author;
import com.aureole.moons.data_entities.Book;
import com.aureole.moons.data_entities.Cart;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

public interface AuthorService extends  BaseService{

    Author save(Author cart);
    List<Author> findAll();

    Set<Book> findBooksByAuthorId(BigInteger authorId);

    Author findById(BigInteger id);
    Author update(BigInteger id, Author author);
    void deleteById(BigInteger id);

}
