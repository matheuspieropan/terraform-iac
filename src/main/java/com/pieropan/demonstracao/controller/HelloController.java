package com.pieropan.demonstracao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello");
    }
}