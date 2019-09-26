package com.tomyum.springboot.demo.controller;

import com.tomyum.springboot.demo.entity.Product;
import com.tomyum.springboot.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/info")
    public ResponseEntity getInfo(){
        return ResponseEntity.ok("Welcome to Demo Service");
    }
}
