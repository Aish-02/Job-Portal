package com.example.zidioproject.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String studentEmail;

    private Long jobId;

    @Column(length = 20)
    private String status;
    

	public Application() {

	}

	public Application(Long id, String studentEmail, Long jobId, String status) {
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

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
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
		return "Application [id=" + id + ", studentEmail=" + studentEmail + ", jobId=" + jobId + ", status=" + status
				+ "]";
	}

}
