package com.aureole.moons.repositories;

import com.aureole.moons.data_entities.Author;
import com.aureole.moons.data_entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.history.RevisionRepository;

import java.math.BigInteger;
import java.util.Optional;
import java.util.Set;


public interface BookRepository extends JpaRepository<Book, BigInteger> , RevisionRepository<Book, BigInteger, BigInteger> {


    @Query("select book from Book book")
    Set<Book> getAllBooks();


    Set<Book>  findByAuthor(Author author);
}
