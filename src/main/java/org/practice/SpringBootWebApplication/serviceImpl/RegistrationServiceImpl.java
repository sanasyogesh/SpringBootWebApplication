package org.practice.SpringBootWebApplication.serviceImpl;

import java.util.List;

import javax.imageio.spi.RegisterableService;

import org.practice.SpringBootWebApplication.model.RegistrationDao;
import org.practice.SpringBootWebApplication.model.UserDetails;
import org.practice.SpringBootWebApplication.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	RegistrationDao registrationDao;
	
	@Override
	public String addUser(UserDetails user) {
		user = registrationDao.save(user); 
		return "User "+ user.getFirstName() + " " + user.getLastName()+ " Saved Successfully.";
	}

	@Override
	public List<UserDetails> getAllRegisteredUsers() {
		return (List<UserDetails>) registrationDao.findAll();
	}

	@Override
	public String deleteRegisteredUser(int id) {
		UserDetails user = registrationDao.findById(id).orElse(null);
		if(user != null)
		{
			registrationDao.deleteById(id);
			return "Registered User "+ user.getFirstName() + " " + user.getLastName() + " deleted Successfully.";
		}else
		{
			return "Registered User with ID "+ id + " Not Exist.";
		}		
	}

	@Override
	public UserDetails getUserDetails(int id) {
		UserDetails user = registrationDao.findById(id).orElse(null);
		if(user != null) {
			return user;
		}
		return null;
	}

	@Override
	public String updateUser(UserDetails updatedUser) {
		UserDetails user = registrationDao.save(updatedUser);
		return "User "+ user.getFirstName() + " " +user.getLastName() + " updated Successfully.";
	}
	
	
	
}
