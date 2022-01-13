package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	//custom finder
	public List<User> findByName(String name);
	
	//using combination
	public List<User> findByNameAndCity(String name,String City);
}
