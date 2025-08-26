package com.example.zidioproject.dto;

public class UserStatusUpdateRequest {
	public String email;
	public boolean isActive;
	
	public UserStatusUpdateRequest() {

	}

	public UserStatusUpdateRequest(String email, boolean isActive) {
		super();
		this.email = email;
		this.isActive = isActive;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "UserStatusUpdateRequest [email=" + email + ", isActive=" + isActive + "]";
	}
	
	
}
