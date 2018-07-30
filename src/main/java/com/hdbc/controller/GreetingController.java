package com.hdbc.controller;

import com.hdbc.domain.Greeting;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description:
 * @author:Young
 * @version:
 * @Project: Bootdemo
 * @Package: com.hdbc.controller
 * @Date date: 2018/7/30
 */

public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
