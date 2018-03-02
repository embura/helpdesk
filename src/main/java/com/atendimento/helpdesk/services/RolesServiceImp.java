package com.atendimento.helpdesk.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.atendimento.helpdesk.model.Role;
import com.atendimento.helpdesk.repositories.RolesRepository.RolesRepository;

public class RolesServiceImp  implements RoleService{

	@Autowired
	private RolesRepository repository;
	
	public RolesServiceImp(RolesRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role create(Role role) {		
		return this.repository.save(role);
	}
	

}
