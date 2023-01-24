package com.aureole.moons.response_payloads;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
public class SampleResponseObject {

    private String firstName;
    private String lastName;
    private String mobile;
    private String college;
    private String location;


    public String toJSONString() throws JsonProcessingException {

       return (new ObjectMapper()).writeValueAsString(this);
    }

}
