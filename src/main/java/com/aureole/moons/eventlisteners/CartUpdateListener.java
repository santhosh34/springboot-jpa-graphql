package com.aureole.moons.eventlisteners;

import com.aureole.moons.data_entities.Cart;
import jakarta.persistence.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CartUpdateListener {
    private static Log log = LogFactory.getLog(CartUpdateListener.class);

    private Cart oldCart;

    private Cart newCart;

//    @PrePersist
//    @PostLoad
//    @PreRemove
//    @HandleBeforeCreate
    @PostLoad
    private void beforeAnyUpdate(Cart cart) {
        if (cart.getId() == null) {
            log.info("[USER AUDIT] About to add a user");
        } else {
            log.info("[USER AUDIT] About to update/delete user: " + cart.getId());
        }
        System.out.println("<============   Old Cart DOWN =========================================> ");
        System.out.println(cart.getId());
        System.out.println(cart.getName1());
        System.out.println(cart.getName2());
        System.out.println(cart.getName3());
        System.out.println("<============   Old Cart UP1 =========================================> ");
    }

//    @PostPersist
    @PostUpdate
//    @PostRemove
    private void afterAnyUpdate(Cart cart) {
        log.info("[USER AUDIT] add/update/delete complete for user: " + cart.getId());
        System.out.println("<============   New Cart DOWN =========================================> ");
        System.out.println(cart.getId());
        System.out.println(cart.getName1());
        System.out.println(cart.getName2());
        System.out.println(cart.getName3());
        System.out.println("<============   New Cart UP =========================================> ");
    }

//    @PostLoad
//    private void afterLoad(Cart cart) {
//        log.info("[USER AUDIT] user loaded from database: " + cart.getId());
//    }
}