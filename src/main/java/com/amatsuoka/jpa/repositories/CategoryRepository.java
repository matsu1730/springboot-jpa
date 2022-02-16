package com.amatsuoka.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amatsuoka.jpa.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long> {

}
