package org.practice.SpringBootWebApplication.controller;

import java.util.List;
import java.util.Map;

import javax.imageio.spi.RegisterableService;

import org.practice.SpringBootWebApplication.model.UserDetails;
import org.practice.SpringBootWebApplication.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	@RequestMapping("/registration")
	public ModelAndView getRegistration() {
		ModelAndView mv = new ModelAndView("registration");
		mv.addObject("operation", "save");
		return mv;
	}
		
	@RequestMapping("/registrationAPI")
	public ModelAndView newRegistration(UserDetails userDetails) {
		System.out.println("Registration API Called.");
		String result = registrationService.addUser(userDetails);
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("member", userDetails);
		mv.addObject("result", result);
		mv.addObject("operation","save");
		return mv;
	}
		
	@RequestMapping("/retrieveregistered")
	public ModelAndView getRegisteredMembersData() {
		System.out.println("Called Retrieve Registered Members...");
		List<UserDetails> allUsers = registrationService.getAllRegisteredUsers();
		ModelAndView mv = new ModelAndView("registeredlist");
		System.out.println(allUsers);
		mv.addObject("memberlist",allUsers);
		return mv;
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView deleteRegisteredUser(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("registeredlist");
		String result = registrationService.deleteRegisteredUser(id);
		mv.addObject("result", result);
		List<UserDetails> allUsers = registrationService.getAllRegisteredUsers();
		mv.addObject("memberlist",allUsers);
		return mv;
	}
	
	@RequestMapping("/fetchforupdate/{id}")
	public ModelAndView retrieveUpdateRegisteredUser(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("registration_update");
		UserDetails user = registrationService.getUserDetails(id);
		mv.addObject("memberdata", user);
		mv.addObject("operation", "update");
		return mv;
	}
	
	@RequestMapping(value="/update")
	public ModelAndView updateRegisteredUser(UserDetails user) {
		ModelAndView mv = new ModelAndView("registeredlist");
		UserDetails updatedUser = registrationService.getUserDetails(user.getId());
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setGender(user.getGender());
		updatedUser.setEducation(user.getEducation());
		
		String result = registrationService.updateUser(updatedUser);
		List<UserDetails> allUsers = registrationService.getAllRegisteredUsers();
		mv.addObject("memberlist",allUsers);
		mv.addObject("result", result);
		return mv;		
	}
	
}











