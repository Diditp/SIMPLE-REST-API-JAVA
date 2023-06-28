package com.Yours.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    /**
     *Ini Query Parameter
    @GetMapping(path = "/helloWorld")
    public String helloWorld(@RequestParam("name") String name){
        return "HelloWorld, My Name is" + name ;
    }
    */

    //Ini Path Parameter
    @GetMapping(path = "/helloWorld/{name}")
    public String helloWorld(@PathVariable("name") String name){
        return "HelloWorld, My Name is " + name ;
    }

}
