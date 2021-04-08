package org.practice.SpringBootWebApplication.controller;

import org.practice.SpringBootWebApplication.model.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@RequestMapping("/registration")
	public String getRegistration() {
		return "registration";
	}
	
	
	
	@RequestMapping("/registrationAPI")
	public ModelAndView newRegistration(UserDetails userDetails) {
		System.out.println("Registration API Called.");
		ModelAndView mv = new ModelAndView("result");
		mv.addObject("member", userDetails);
		return mv;
	}
	
}
