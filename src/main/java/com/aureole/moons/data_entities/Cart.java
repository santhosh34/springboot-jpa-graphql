package com.aureole.moons.data_entities;
import java.math.BigInteger;
import jakarta.persistence.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "cart123")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
    private String name1;
    private String name2;
    private String name3;


    public Cart() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }


    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

}