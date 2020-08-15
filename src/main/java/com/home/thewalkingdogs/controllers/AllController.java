package com.home.thewalkingdogs.controllers;

import com.home.thewalkingdogs.models.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AllController {




    @GetMapping(path = "/data")
   // @CrossOrigin(origins = "http://localhost:4200")
    public String  second(){
        System.out.println("getmaping spring");
        return "some data";


    }
}
