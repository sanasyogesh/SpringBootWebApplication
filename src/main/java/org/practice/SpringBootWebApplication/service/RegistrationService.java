package org.practice.SpringBootWebApplication.service;

import java.util.List;

import org.practice.SpringBootWebApplication.model.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {

	public String addUser(UserDetails user);
	
	public List<UserDetails> getAllRegisteredUsers();
	
	public String deleteRegisteredUser(int id);
	
	public UserDetails getUserDetails(int id);
	
	public String updateUser(UserDetails updatedUser);
}
