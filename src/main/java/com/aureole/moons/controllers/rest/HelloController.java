//package com.aureole.moons.controllers;
//
//import com.aureole.moons.response_payloads.SampleResponseObject;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RequestMapping("/greetings")
//@RestController
//public class HelloController {
//
//    @GetMapping (path = "",produces = MediaType.APPLICATION_JSON_VALUE)
//    public String getGreeting() throws JsonProcessingException {
//
//            SampleResponseObject sampleResponseObject = new SampleResponseObject();
//            sampleResponseObject.setFirstName("santhosh");
//            sampleResponseObject.setLastName("santhosh");
//            sampleResponseObject.setCollege("santhosh");
//            sampleResponseObject.setLocation("santhosh");
//            sampleResponseObject.setMobile("santhosh");
//        System.out.println("sdsaasdsadsa");
//            return sampleResponseObject.toJSONString();
//    }
//}
