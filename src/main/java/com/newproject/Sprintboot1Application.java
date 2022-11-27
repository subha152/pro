package com.newproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.newproject.dao.UserRepo;
import com.newproject.entity.User;

@SpringBootApplication
public class Sprintboot1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Sprintboot1Application.class, args);
		UserRepo userRepo=context.getBean(UserRepo.class);
		
		User user=new User();
		user.setName("Subha Ghosh");
		user.setCity("Kolkata");
		user.setStatus("I am Programmer");
		User user1=userRepo.save(user);
		System.out.print(user1);
	}

}
