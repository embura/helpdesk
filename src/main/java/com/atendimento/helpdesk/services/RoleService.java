package com.atendimento.helpdesk.services;

import java.util.List;

import com.atendimento.helpdesk.model.Role;

public interface RoleService {
	
	public List<Role> findAll();
	
	public Role create(Role role);	

}
