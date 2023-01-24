package com.aureole.moons.repositories;

import com.aureole.moons.data_entities.Author;
import com.aureole.moons.data_entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.history.RevisionRepository;

import java.math.BigInteger;
import java.util.Set;


public interface AuthorRepository extends JpaRepository<Author, BigInteger> , RevisionRepository<Author, BigInteger, BigInteger> {


    @Query("select book from Book book where book.author.authorId = ?1 ")
    Set<Book> getBooksByAuthorId(BigInteger authorId);

}
