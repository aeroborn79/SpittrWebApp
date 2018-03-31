package com.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	
	@RequestMapping(value="/register", method=GET)
		public String showRegistrationForm() {
		return "registerForm";
	}

}
