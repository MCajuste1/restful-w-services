package com.in28minutes.rest.webservices.restfulwservices;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloworld(){

    return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        throw new RuntimeException( "Some Error has Happened! Contact Support!" );
      //  return new HelloWorldBean("Hello World - Changed");
    }
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format( "Hello World, %s", name ));
    }

}
