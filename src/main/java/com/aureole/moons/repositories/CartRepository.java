package com.aureole.moons.repositories;

import com.aureole.moons.data_entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;


import java.math.BigInteger;


public interface CartRepository extends JpaRepository<Cart, BigInteger> , RevisionRepository<Cart, BigInteger, BigInteger> {

}
