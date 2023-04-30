package com.project.music.vst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.music.vst.dto.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{
    
}
