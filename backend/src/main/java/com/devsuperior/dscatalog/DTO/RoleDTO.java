package com.devsuperior.dscatalog.DTO;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Rule;

public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String authority;
	
	public RoleDTO() {
	}

	public RoleDTO(Long id, String authority) {
		this.id = id;
		this.authority = authority;
	}
	
	public RoleDTO(Rule rule) {
		id = rule.getId();
		authority = rule.getAuthority();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
}