package com.app.finance_backend.model;

public class User {
	
	private int id;
	private String name;
	private String role;
	private boolean active;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + ", active=" + active + "]";
	}
	public User(int id, String name, String role, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	} 

}
