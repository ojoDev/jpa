package com.ojodev.spring.jpaexample.jpaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ojodev.spring.jpaexample.jpaexample.entity.User;
import com.ojodev.spring.jpaexample.jpaexample.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
		@Autowired
		private UserDAOService userDaoService;
	
		@Override
		public void run(String... args) throws Exception {
			User user = new User("Jack", "Admin");
			//Spring boot va a detectar que insertamos este usuario y, como tenemos la BBDD embebida H2, lo meterá ahi.
			// Podemos consultar la BBDD H2 en la url http://localhost:8080/h2-console/ y entrar a ver las tablas con el JDBC URL: jdbc:h2:mem:testdb 
			long insert = userDaoService.insert(user);
			log.info("New User is created: "+user);
		}
}
