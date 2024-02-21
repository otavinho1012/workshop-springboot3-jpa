	package com.aprendendoweb.earning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.earning.entities.OrderItem;
import com.aprendendoweb.earning.entities.pk.OrderItemPK;


//Registrando um repositório 

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
