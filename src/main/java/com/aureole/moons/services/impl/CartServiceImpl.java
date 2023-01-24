package com.aureole.moons.services.impl;

import com.aureole.moons.data_entities.Cart;
import com.aureole.moons.repositories.CartRepository;
import com.aureole.moons.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart save(Cart cart){
        return cartRepository.saveAndFlush(cart);
    }

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart findById(BigInteger id){
        System.out.println("id value:"+id);
        Optional<Cart> optionalCart= cartRepository.findById(id);
        Cart cart = optionalCart.stream().findFirst().orElse(null);
        System.out.println("cart=========>"+cart);
        return cart;
    }

    /**
     * Update the cart based on new payload
     * @param id
     * @param cartPayload
     * @return
     */
    public Cart update(BigInteger id, Cart cartPayload){
        cartPayload.setId(id);
        return cartRepository.saveAndFlush(cartPayload);
    }

    /**
     *  Build a response with 204  No Content
     * @param id
     */
    public void deleteById(BigInteger id){
        cartRepository.deleteById(id);
    }
}
