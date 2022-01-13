package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setName("Abhishek Kumar Srivastava");
//		user.setCity("Chapraa");
//		user.setStatus("Job");
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
//		User user = new User();
//		user.setName("Veena Kumar Srivastava");
//		user.setCity("Motihari");
//		user.setStatus("Housewife");
//
//		User user1 = new User();
//		user1.setName("Amit Kumar Srivastava");
//		user1.setCity("Umbergoan");
//		user1.setStatus("chandel");
//				
//		saving user
//		User user_ = userRepository.save(user);
//		User user11 = userRepository.save(user1);
//		
//		System.out.println(user_);
//		System.out.println(user11);
		
		//save all object at once
//		
//		User user = new User();
//		user.setName("Veena Kumar Srivastava");
//		user.setCity("Motihari");
//		user.setStatus("Housewife");
//		
//		
//		
//		User user1 = new User();
//		user1.setName("Amit Kumar Srivastava");
//		user1.setCity("Umbergoan");
//		user1.setStatus("chandel");
//		
//		List<User> users = List.of(user,user1);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(e->{
//			System.out.println(e);
//		});
		
		//update name of user id 1
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//		user.setName(" Kinu + Abhihshek ");
//		User result = userRepository.save(user);
//		System.out.println(result);
		
		//delete
		//userRepository.existsById(1);
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(e->System.out.println(e));
//		userRepository.deleteAll(allusers);
		
		//using custom finder
		
		List<User> list = userRepository.findByName("Veena Kumar Srivastava");
		System.out.println(list);
		
		//example 2
		
		List<User> list1 = userRepository.findByNameAndCity("Veena Kumar Srivastava","Motihari");
		System.out.println(list1);
	}

}
