//package com.aureole.moons.controllers;
//
//
//import org.springframework.boot.configurationprocessor.json.JSONException;
//import org.springframework.boot.configurationprocessor.json.JSONObject;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RequestMapping("/headers")
//@RestController
//public class HeaderController {
//
//    @GetMapping("/single-header")
//    public ResponseEntity getSingleHeaderPassed(@RequestHeader String  token1) throws JSONException {
//        System.out.println("token value:"+token1);
//        HashMap hashMap = new HashMap();
//        hashMap.put("token1", token1);
//        JSONObject jsonObject= new JSONObject();
//        jsonObject.put("token1", token1);
//        return ResponseEntity.ok().body(hashMap);
//    }
//
//
//    @GetMapping("/all-headers")
//    public ResponseEntity getAllHeaderPassed(@RequestHeader Map<String, String> headers){
//        System.out.println("token value:"+headers);
//        headers.forEach((key, value) -> {
////            LOG.info(String.format("Header '%s' = %s", key, value));
//            System.out.println( key +"==>"+ value);
//        });
//        return ResponseEntity.ok().body(headers);
//    }
//}
