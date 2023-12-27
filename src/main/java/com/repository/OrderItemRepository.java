package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.OrderItem;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
