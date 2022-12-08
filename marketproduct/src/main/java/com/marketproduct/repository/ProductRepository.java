package com.marketproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketproduct.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
