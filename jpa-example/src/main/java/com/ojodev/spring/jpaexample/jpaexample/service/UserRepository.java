package com.ojodev.spring.jpaexample.jpaexample.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojodev.spring.jpaexample.jpaexample.entity.User;

// Ejemplo de uso de Spring Data:
// Creamos un Repositorio que extiende de JpaRepository y especificamos el objeto y el tipo de primary key

public interface UserRepository extends JpaRepository<User,Long>{

}
