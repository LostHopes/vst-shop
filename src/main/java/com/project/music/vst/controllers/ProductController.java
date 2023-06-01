package com.project.music.vst.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.music.vst.dto.Products;
import com.project.music.vst.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productsRepository;

    @Autowired
    public ProductController(ProductRepository productsRepository)
    {
        this.productsRepository = productsRepository;
    }

    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts()
    {
        List<Products> users = productsRepository.findAll();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Products> getUser(@PathVariable("id") Long id){
        Optional<Products> user = productsRepository.findById(id);
        return ResponseEntity.ok(user.get());
    }
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") Long id) {
        try {
            productsRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error occurred after trying to delete product from the database: " + e.getMessage());
        }
    }
}
