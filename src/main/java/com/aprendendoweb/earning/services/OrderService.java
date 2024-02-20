package com.aprendendoweb.earning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoweb.earning.entities.Order;
import com.aprendendoweb.earning.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
		
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	//retornando o id como um Obejto
	public Order findById(Long id){
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
	
	
	
}
