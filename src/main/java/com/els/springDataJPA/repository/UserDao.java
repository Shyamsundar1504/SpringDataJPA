package com.els.springDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.els.springDataJPA.entity.User;


public interface UserDao extends JpaRepository<User, Integer>{

	  public User findByName(String name);
}
