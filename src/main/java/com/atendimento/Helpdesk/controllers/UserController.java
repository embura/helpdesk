package com.atendimento.Helpdesk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atendimento.Helpdesk.model.User;

@Controller
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public String index(Model model) {
		return "user/index";
		
	}
	
	@GetMapping
	public String create(Model model) {
		model.addAttribute("user", new User());
		return "user/index";
	}
	
	
	
	
}
