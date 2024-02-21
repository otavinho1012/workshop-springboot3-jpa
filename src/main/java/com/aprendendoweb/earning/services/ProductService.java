package com.aprendendoweb.earning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoweb.earning.entities.Product;
import com.aprendendoweb.earning.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
		
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	//retornando o id como um Obejto
	public Product findById(Long id){
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}
	
	
	
}
