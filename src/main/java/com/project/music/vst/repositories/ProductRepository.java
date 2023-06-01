package com.project.music.vst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.music.vst.dto.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long>{}
