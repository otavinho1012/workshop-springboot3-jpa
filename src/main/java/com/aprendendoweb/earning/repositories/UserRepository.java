package com.aprendendoweb.earning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.aprendendoweb.earning.entities.User;


//Registrando um repositório 

public interface UserRepository extends JpaRepository<User, Long>{
	
}
