package com.projetojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojava.curso.entities.OrderItem;
import com.projetojava.curso.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{
	
}
