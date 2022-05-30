package com.devsuperior.uri2621.dto;

import java.io.Serializable;

import com.devsuperior.uri2621.projections.ProductMinProjection;

public class LawyerMinDTO implements Serializable{
	
	private String name;
	
	public LawyerMinDTO() {
	}

	public LawyerMinDTO(String name) {
		this.name = name;
	}
	
	public LawyerMinDTO(ProductMinProjection projection) {
		name = projection.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProductMinDTO [name=" + name + "]";
	}
}
