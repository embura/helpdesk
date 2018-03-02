package com.atendimento.helpdesk.repositories.RolesRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atendimento.helpdesk.model.Role;

@Repository
public interface RolesRepository  extends JpaRepository<Role, Long>{
	
	

}
