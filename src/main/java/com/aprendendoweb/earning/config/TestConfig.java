package com.aprendendoweb.earning.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aprendendoweb.earning.entities.User;
import com.aprendendoweb.earning.repositories.UserRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	
	//tudo que eu executar aqui vai ser executado como se fosse um main 
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		
		//saveAll ele salva uma lista de Objetos  
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		
		
	}
}
