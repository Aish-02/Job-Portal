package com.example.zidioproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Job")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50)
	private String title;
	@Column(length = 100)
	private String description;
	@Column(length = 50)
	private String companyName;
	@Column(length = 50)
	private String location;
	@Column(length = 50)
	private JobType jobType;
	@Column(length = 50)
	private String duration;
	@Column(length = 50)
	private String skills;
	@Column(length = 100)
	private String postedBy;
	
	public Job() {
		
	}

	public Job(Long id, String title, String description, String companyName, String location, JobType jobType,
			String duration, String skills, String postedBy) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.companyName = companyName;
		this.location = location;
		this.jobType = jobType;
		this.duration = duration;
		this.skills = skills;
		this.postedBy = postedBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", title=" + title + ", description=" + description + ", companyName=" + companyName
				+ ", location=" + location + ", jobType=" + jobType + ", duration=" + duration + ", skills=" + skills
				+ ", postedBy=" + postedBy + "]";
	}

	
	

}
