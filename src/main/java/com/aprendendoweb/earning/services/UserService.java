package com.aprendendoweb.earning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoweb.earning.entities.User;
import com.aprendendoweb.earning.repositories.UserRepository;

//Definindo que é um service e tem dependencia, sendo o U
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
		
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	
	public User findById(Long id){
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
}
