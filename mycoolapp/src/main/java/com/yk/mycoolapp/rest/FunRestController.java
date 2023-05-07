package com.yk.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FunRestController {
    // expose sample endpoint which return hello world

    @GetMapping(value = "/")
    public String sayHello(@RequestParam(value = "name", defaultValue = "YK") String name) {
        return "Hello world " + name;
    }

}
