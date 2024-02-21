package com.aprendendoweb.earning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.earning.entities.Product;


//Registrando um repositório 

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
