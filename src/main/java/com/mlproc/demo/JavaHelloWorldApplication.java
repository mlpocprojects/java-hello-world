package com.mlproc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@SpringBootApplication
public class JavaHelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("main is called...");
        SpringApplication.run(JavaHelloWorldApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Say , Hello is called...");
        return "Welcome to Java Hello World !!!";
    }
}
