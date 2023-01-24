package com.aureole.moons.response_builders;

import org.springframework.http.ResponseEntity;

public class CommonResponseBuilder {

    public static ResponseEntity build204Response(){
        // return ResponseEntity.notFound().build();
        return ResponseEntity.status(204).build();
    }
}
