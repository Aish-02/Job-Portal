package com.example.zidioproject.dto;

public class ApplicationResponse {
	public Long id;
	public String studentEmail;
	public long jobId;
	public String status;

	public ApplicationResponse() {

	}

	public ApplicationResponse(Long id, String studentEmail, long jobId, String status) {
		super();
		this.id = id;
		this.studentEmail = studentEmail;
		this.jobId = jobId;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ApplicationResponse [id=" + id + ", studentEmail=" + studentEmail + ", jobId=" + jobId + ", status="
				+ status + "]";
	}

}
