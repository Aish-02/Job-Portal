package com.example.zidioproject.dto;

import com.example.zidioproject.entity.JobType;

public class JobRequest {
	public String title;
	public String description;
	public String companyName;
	public String location;
	public JobType jobType;
	public String duration;
	public String skills;
	public String postedBy;

	public JobRequest() {

	}

	public JobRequest(String title, String description, String companyName, String location, JobType jobType,
			String duration, String skills, String postedBy) {
		super();
		this.title = title;
		this.description = description;
		this.companyName = companyName;
		this.location = location;
		this.jobType = jobType;
		this.duration = duration;
		this.skills = skills;
		this.postedBy = postedBy;
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
		return "JobRequest [title=" + title + ", description=" + description + ", companyName=" + companyName
				+ ", location=" + location + ", jobType=" + jobType + ", duration=" + duration + ", skills=" + skills
				+ ", postedBy=" + postedBy + "]";
	}

}
