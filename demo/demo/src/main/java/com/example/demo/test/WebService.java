package com.example.demo.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebService {

    @PostMapping("/test")
    public String postTest(){
        return "Hello";
    }

    @GetMapping("/test")
    public String getTest(@RequestParam("name") String name){
        return "Hello " + name;
    }

    @GetMapping("/test2/{name}")
    public String getTest2(@PathVariable("name") String name){
        return "Hello " + name;
    }

    @PostMapping("/test3")
    public String getTest3(@RequestParam("name") String name){
        return "Hello " + name;
    }

}
