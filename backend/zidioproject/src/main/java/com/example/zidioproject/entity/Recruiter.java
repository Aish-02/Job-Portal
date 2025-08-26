package com.example.zidioproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Recruiter")
public class Recruiter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50)
	private String companyName;
	@Column(length = 50)
	private String recruiterEmail;
	@Column(length = 50)
	private String recruiterName;
	@Column(length = 50)
	private String designation;

	public Recruiter() {
		
	}
	
	public Recruiter(Long id, String companyName, String recruiterEmail, String recruiterName, String designation) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.recruiterEmail = recruiterEmail;
		this.recruiterName = recruiterName;
		this.designation = designation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRecruiterEmail() {
		return recruiterEmail;
	}

	public void setRecruiterEmail(String recruiterEmail) {
		this.recruiterEmail = recruiterEmail;
	}

	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Recruiter [id=" + id + ", companyName=" + companyName + ", recruiterEmail=" + recruiterEmail
				+ ", recruiterName=" + recruiterName + ", designation=" + designation + "]";
	}

	

}
