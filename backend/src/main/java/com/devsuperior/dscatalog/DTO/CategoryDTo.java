package com.devsuperior.dscatalog.DTO;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	public CategoryDTo(){
	}

	public CategoryDTo(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTo(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}