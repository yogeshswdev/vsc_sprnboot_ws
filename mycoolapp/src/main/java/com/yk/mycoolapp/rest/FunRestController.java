package com.yk.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
    // expose sample endpoint which return hello world

    @GetMapping(value = "/")
    public String sayHello() {
        return "Hello world";
    }

}
