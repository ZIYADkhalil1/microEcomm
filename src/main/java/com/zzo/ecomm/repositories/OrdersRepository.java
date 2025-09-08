package com.zzo.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zzo.ecomm.entities.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

}
