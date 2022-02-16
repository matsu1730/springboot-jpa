package com.amatsuoka.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amatsuoka.jpa.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long> {

}
