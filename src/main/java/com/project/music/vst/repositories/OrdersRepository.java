package com.project.music.vst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.music.vst.dto.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{
    
}
