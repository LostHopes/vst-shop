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

import com.project.music.vst.dto.Orders;
import com.project.music.vst.repositories.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public ResponseEntity<List<Orders>> getAllProducts() {
        List<Orders> orders = orderRepository.findAll();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orders> getUser(@PathVariable("id") Long id) {
        Optional<Orders> order = orderRepository.findById(id);
        return ResponseEntity.ok(order.get());
    }
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") Long id) {
        try {
            orderRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error occurred after trying to delete order from the database: " + e.getMessage());
        }
    }
    
}
