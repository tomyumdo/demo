package com.tomyum.springboot.demo.repository;

import com.tomyum.springboot.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
