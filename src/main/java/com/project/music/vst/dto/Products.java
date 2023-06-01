package com.project.music.vst.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private Double price;
    private boolean isAvailable;
    @ManyToOne
    @JoinColumn(name = "salerId", referencedColumnName = "id")
    private Users users;
    // @ManyToOne
    // @JoinColumn(name = "order_id")
    // private Orders order;

}
