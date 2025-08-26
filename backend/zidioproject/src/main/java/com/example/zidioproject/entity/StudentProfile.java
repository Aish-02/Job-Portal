package com.example.zidioproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentProfile")
public class StudentProfile {
	@Id
	private Long userId;
	@OneToOne
	@MapsId
	private User user;
	@Column(length = 50)
	private String name;
	@Column(length = 50)
	private String email;
	@Column(length = 50)
	private String course;
	@Column(length = 50)
	private String university;
	@Column(length = 70)
	private String resumeUrl;

	public StudentProfile() {

	}

	public StudentProfile(Long userId, User user, String name, String email, String course, String university,
			  String resumeUrl) {
		super();
		this.userId = userId;
		this.user = user;
		this.name = name;
		this.email = email;
		this.course = course;
		this.university = university;
		this.resumeUrl = resumeUrl;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		return "StudentProfile [userId=" + userId + ", user=" + user + ", name=" + name + ", email=" + email
				+ ", course=" + course + ", university=" + university + ", yearOfStudy="
				+ ", resumeUrl=" + resumeUrl + "]";
	}


}
