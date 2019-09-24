package com.revature.model;

public class Pokemon {
	int i;
	String name, type;
	
	
	public Pokemon() {
		super();
	}
	
	public Pokemon(int i, String name, String type) {
		super();
		this.i = i;
		this.name = name;
		this.type = type;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBio() {
		return type;
	}
	public void setBio(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Pokemon [i=" + i + ", name=" + name + ", type=" + type + "]";
	}
	
}
