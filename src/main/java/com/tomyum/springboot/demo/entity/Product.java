package com.tomyum.springboot.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    @Column(name = "category_id")
    private Long categoryId;

    @ManyToOne(optional = false)
    @JoinColumn(name="category_id", nullable=false, insertable = false, updatable = false)
    private Category category;

}
