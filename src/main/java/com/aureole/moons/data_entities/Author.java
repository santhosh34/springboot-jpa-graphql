package com.aureole.moons.data_entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Author  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", nullable = false)
    private BigInteger authorId;


    private String firstName;

    private String lastName;

    private String contact;

    private String country ;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Book> books;

}



