package com.project.music.vst.dto;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    private Users users;

    @ManyToMany
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Products products;


    private String status;
}
