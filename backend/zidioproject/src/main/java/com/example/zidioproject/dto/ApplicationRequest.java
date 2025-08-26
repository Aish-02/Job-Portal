package com.example.zidioproject.dto;

public class ApplicationRequest {
	public String studentEmail;
	public Long jobId;

	public ApplicationRequest() {

	}

	public ApplicationRequest(String studentEmail, Long jobId) {
		super();
		this.studentEmail = studentEmail;
		this.jobId = jobId;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "ApplicationRequest [studentEmail=" + studentEmail + ", jobId=" + jobId + "]";
	}

}
