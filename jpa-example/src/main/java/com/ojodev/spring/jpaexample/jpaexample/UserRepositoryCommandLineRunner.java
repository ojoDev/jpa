package com.ojodev.spring.jpaexample.jpaexample;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ojodev.spring.jpaexample.jpaexample.entity.User;
import com.ojodev.spring.jpaexample.jpaexample.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
		// Ejemplo de repositorio Spring Data
		@Autowired
		private UserRepository userRepository;
	
		@Override
		public void run(String... args) throws Exception {
			User user = new User("Jack", "Admin");
			
			//Spring data: Guardar
			userRepository.save(user);
			
			//Buscar
			Optional<User> userWithIdOne = userRepository.findById(1L);
			log.info("User retrived: "+userWithIdOne);
			
			//Buscar
			List<User> users = userRepository.findAll();
			log.info("All userss: "+users);
		}
}
