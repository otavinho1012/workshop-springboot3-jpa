package com.aprendendoweb.earning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.earning.entities.Order;


//Registrando um repositório 

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
