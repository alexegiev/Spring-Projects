//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.springboot.demo.springapplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    public FunRestController() {
    }

    @GetMapping({"/"})
    public String sayHello() {
        return "Hello World";
    }
}