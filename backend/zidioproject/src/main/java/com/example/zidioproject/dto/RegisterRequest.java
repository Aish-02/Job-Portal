package com.example.zidioproject.dto;

import com.example.zidioproject.entity.Roles;

public class RegisterRequest {
	public String name;
	public String email;
	public String password;
	public Roles role;
	
	public RegisterRequest() {
		
	}
	
	public RegisterRequest( String name, String email, String password, Roles role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "RegisterRequest [email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	

}
