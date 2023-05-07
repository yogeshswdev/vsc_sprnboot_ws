package com.yk.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;

import com.yk.mycoolapp.Greetings;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FunRestController {
    // expose sample endpoint which return hello world

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/")
    public Greetings sayHello(@RequestParam(value = "name", defaultValue = "YK") String name) {
        // return "Hello world " + name;
        return new Greetings(counter.incrementAndGet(), "Hello " + name);
    }

}
