package com.shashank.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.shashank.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
