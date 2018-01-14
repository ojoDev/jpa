package com.ojodev.spring.jpaexample.jpaexample.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ojodev.spring.jpaexample.jpaexample.entity.User;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		
		entityManager.persist(user); // User entraría a estar dentro del persistence context.
		
		return user.getId();
	}
	
}
