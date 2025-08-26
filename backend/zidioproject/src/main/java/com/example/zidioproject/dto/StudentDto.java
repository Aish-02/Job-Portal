package com.example.zidioproject.dto;

public class StudentDto {
	public String name;
	public String email;
	public String course;
	public String university;
	public String resumeUrl;
	
	public StudentDto() {
		
	}

	public StudentDto(String name, String email, String course, String university,
			String resumeUrl) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		this.university = university;
		this.resumeUrl = resumeUrl;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getResumeUrl() {
		return resumeUrl;
	}
	public void setResumeUrl(String resumeUrl) {
		this.resumeUrl = resumeUrl;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", email=" + email + ", course=" + course
			 + ", university=" + university + ", resumeUrl=" + resumeUrl + "]";
	}
	
	

}
