package com.example.javaspringboot.ui.controller;

import com.example.javaspringboot.data.model.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public class UserController {

    @RestController
    @RequestMapping("users")
    public static class RestService {

        @Value("${prop.FIRST_NAME}")
        private String userFirstName;

        @Value("${prop.MIDDLE_NAME}")
        private String middleName;

        @Value("${prop.LAST_NAME}")
        private String lastName;


        @GetMapping(path="{userId}",
                produces = {
                        MediaType.APPLICATION_XML_VALUE,
                        MediaType.APPLICATION_JSON_VALUE
                        } )
        public UserData getUser(@PathVariable String userId){
            System.out.println("Get user is called...");
            UserData uData = new UserData();
            uData.setUserFirstName(userFirstName + " <--> "+userId);
            uData.setUserEmail(userFirstName+"@gmail.com");
            uData.setUserMiddleName(middleName);
            uData.setUserLastName(lastName);
            uData.toString();
            return uData;
        }

        @GetMapping
        public String getUsers(@RequestParam(value="page",defaultValue = "1") int page,
                               @RequestParam(value="limit",defaultValue = "50", required = false) int limit
        ){
            System.out.println("Get users is called..."); // print the log

            return "get user is called with parameters page : " + page + " and limit : " + limit;
        }

        @PostMapping
        public String createUser(){
            System.out.println("Create user is called...");
            return "create user is called";
        }

        @PutMapping
        public String updateUser(){
            System.out.println("Update user is called...");
            return "update user is called";
        }

        @DeleteMapping
        public String deleteUser(){
            System.out.println("Delete user is called...");
            return "delete user is called";
        }

    }
}
