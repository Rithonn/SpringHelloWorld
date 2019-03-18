package com.helloWorld.helloWorldExample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world and all who inhabit it!";
    }


}
