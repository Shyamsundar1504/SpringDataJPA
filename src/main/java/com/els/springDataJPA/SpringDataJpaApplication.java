package com.els.springDataJPA;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.els.springDataJPA.entity.User;
import com.els.springDataJPA.repository.UserDao;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringDataJpaApplication.class, args);
	UserDao userDao= ctx.getBean(UserDao.class);
	
	
	User user = new User();
	user.setName("omm chandra");
	user.setAddress("Bhubaneswar");
//	 User u=   userDao.save(user);
//	 System.out.println(u);
	 
	
//	find by id 
//	User u= userDao.findById(1).get();
//	System.out.println(u);
	
//	find all
//         List<User> u=	userDao.findAll();
//         System.out.println(u);
	
//	find by name
	
	User u=userDao.findByName("shyam sundar");
	System.out.println(u);
	}

	
}
