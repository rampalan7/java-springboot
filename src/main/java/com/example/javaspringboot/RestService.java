package com.example.javaspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class RestService {

    @Value("${prop.FIRST_NAME}")
    private String firstName;

    @Value("${prop.MIDDLE_NAME}")
    private String middleName;

    @Value("${prop.LAST_NAME}")
    private String lastName;

    @GetMapping("/firstName")
    public String firstName(){
        return firstName;
    }

    @GetMapping("/middleName")
    public String middleName(){
        return middleName;
    }

    @GetMapping("/lastName")
    public String lastName(){
        return lastName;
    }
}
