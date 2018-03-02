package com.atendimento.helpdesk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atendimento.helpdesk.model.Role;

@Controller
@RequestMapping("/roles")
public class RoleController {

	@GetMapping
	public String index(Model model) {
		return "roles/index";		
	}
	
	@GetMapping("/new")
	public String create(Model model) {
		model.addAttribute("role", new Role());
		return "roles/create";
	}	
	
	@PostMapping("/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {	
		model.addAttribute("role", new Role());
		return "roles/edit"; 
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long id) {
		return null; 
	}
	
}

