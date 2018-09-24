package com.gmail.kostamazanenko;

import java.io.Serializable;

public class Cat implements Serializable{
	private String name;
	
	public Cat(String name) {
		super();
		this.name = name;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
	
}
