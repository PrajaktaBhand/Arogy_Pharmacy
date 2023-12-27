package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
