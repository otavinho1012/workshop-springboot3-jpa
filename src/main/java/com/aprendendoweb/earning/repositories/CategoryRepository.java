package com.aprendendoweb.earning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoweb.earning.entities.Category;


//Registrando um repositório 

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
