package org.practice.SpringBootWebApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@RequestMapping("/home")
	public String getFirstWelcomePage() {
		return "homepage";
	}
}
