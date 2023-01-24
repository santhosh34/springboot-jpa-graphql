//package com.aureole.moons.controllers;
//
//import com.aureole.moons.data_entities.Cart;
//import com.aureole.moons.response_builders.CommonResponseBuilder;
//import com.aureole.moons.services.CartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.math.BigInteger;
//import java.util.List;
//
//@RequestMapping("/carts")
//@RestController
//public class CartController {
//
//    @Autowired
//    private CartService cartService;
//
//    @PostMapping()
//    public Cart createCart(@RequestBody Cart cart){
//        return cartService.save(cart);
//    }
//
//    @GetMapping()
//    public List<Cart> getAllCarts(){
//        return cartService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity getCartById(@PathVariable  BigInteger id){
//        System.out.println("id value:"+id);
//        Cart cart= cartService.findById(id);
//        if(cart ==null){
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok().body(cart);
//    }
//
//    @PatchMapping("/{id}")
//    public Cart updateCart(@PathVariable BigInteger id, @RequestBody Cart cartUpdateRequest){
//        System.out.println("id==>"+id);
//        System.out.println("cartUpdateRequest==>"+cartUpdateRequest);
//        return cartService.update(id, cartUpdateRequest);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity deleteCartById(@PathVariable BigInteger id){
//         cartService.deleteById(id);
//        return CommonResponseBuilder.build204Response();
//    }
//
//
//
//}
