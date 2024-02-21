package com.aprendendoweb.earning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoweb.earning.entities.Category;
import com.aprendendoweb.earning.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository orderRepository;
		
	public List<Category> findAll(){
		return orderRepository.findAll();
	}
	
	//retornando o id como um Obejto
	public Category findById(Long id){
		Optional<Category> obj = orderRepository.findById(id);
		return obj.get();
	}
	
	
	
}
