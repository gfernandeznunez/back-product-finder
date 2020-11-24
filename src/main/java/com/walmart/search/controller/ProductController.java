package com.walmart.search.controller;

import com.walmart.search.model.Product;
import com.walmart.search.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products/{value}")
    public ResponseEntity<List<Product>> find(@PathVariable String value){

        List<Product> products = productService.findProducts(value);

        return new ResponseEntity<>(products , HttpStatus.OK);

    }
}
