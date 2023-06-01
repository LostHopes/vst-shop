package com.project.music.vst.controllers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.project.music.vst.dto.Orders;
import com.project.music.vst.repositories.OrderRepository;

@WebMvcTest(OrderController.class)
public class OrderControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderRepository orderRepository;

    @Test
    public void testGetAllOrders() throws Exception {
        mockMvc.perform(get("/orders")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetOrder() throws Exception {
        Orders order = new Orders();
        order.setId(1L);
        order.setPrice(11.99);

        when(orderRepository.findById(1L)).thenReturn(Optional.of(order));

        mockMvc.perform(get("/orders/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}