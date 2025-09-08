package com.zzo.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zzo.ecomm.entities.OrderItems;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {

}
