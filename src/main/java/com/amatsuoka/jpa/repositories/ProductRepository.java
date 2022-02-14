package com.amatsuoka.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amatsuoka.jpa.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long> {

}
