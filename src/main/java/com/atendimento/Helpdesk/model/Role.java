package com.atendimento.Helpdesk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="roles")
public class Role {
	
	public Role() {}
	
	public Role(String role) {
		this.role = role;		
	}	
	
	public Role(String role, Long id) {
		this.role = role;
		this.id = id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;	
	
	@Column
	@NotEmpty(message="Can not be empty")
	private String role;

	public String getRole() {
		return role;
	}

	public void setName(String role) {
		this.role = role;
	}
	
	

}
