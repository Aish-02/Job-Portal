package com.example.zidioproject.dto;

public class RecruiterRequest {
	public String companyName;
	public String recruiterName;
	public String recruiterEmail;
	public String designation;

	public RecruiterRequest() {

	}

	public RecruiterRequest(String companyName, String recruiterName, String recruiterEmail, String designation) {
		super();
		this.companyName = companyName;
		this.recruiterName = recruiterName;
		this.recruiterEmail = recruiterEmail;
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}

	public String getRecruiterEmail() {
		return recruiterEmail;
	}

	public void setRecruiterEmail(String recruiterEmail) {
		this.recruiterEmail = recruiterEmail;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "RecruiterRequest [companyName=" + companyName + ", recruiterName=" + recruiterName + ", recruiterEmail="
				+ recruiterEmail + ", designation=" + designation + "]";
	}

}