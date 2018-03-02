package com.atendimento.helpdesk.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atendimento.helpdesk.model.Role;
import com.atendimento.helpdesk.services.RoleService;

@Controller
@RequestMapping("/roles")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	

	@GetMapping
	public String index(Model model) {
		return "roles/index";		
	}
	
	@GetMapping("/new")
	public String create(Model model) {
		model.addAttribute("role", new Role());
		return "roles/create";
	}
	
	@PostMapping
	public String save(@Valid @ModelAttribute("role") Role role, BindingResult bindingResult, Model model) {	
		if(bindingResult.hasErrors()) {
			return "redirect:/roles/new";
		}
		
		return "roles/edit"; 
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

