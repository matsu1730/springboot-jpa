package com.amatsuoka.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amatsuoka.jpa.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {

}
