package com.aureole.moons.services;


import com.aureole.moons.data_entities.Author;
import com.aureole.moons.data_entities.Cart;

import java.math.BigInteger;
import java.util.List;

public interface CartService extends  BaseService{

    Cart save(Cart cart);
    List<Cart> findAll();
    Cart findById(BigInteger id);
    Cart update(BigInteger id, Cart cart);
    void deleteById(BigInteger id);
}
