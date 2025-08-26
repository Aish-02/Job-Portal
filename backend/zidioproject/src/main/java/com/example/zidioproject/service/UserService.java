package com.example.zidioproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zidioproject.entity.User;
import com.example.zidioproject.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	 private UserRepository userRepository;
	
	 public Optional<User> getUserByEmail(String email) {
	 return userRepository.findByEmail(email);
	 }
	 
	 public User saveUser(User user) {
	 return userRepository.save(user);
	 }
	 
	 public List<User> getAllUsers(){
		 return userRepository.findAll();
	 }
	 
	 public User createUser(User user) {
	        return userRepository.save(user);
	  }
	 
	 public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }

}
