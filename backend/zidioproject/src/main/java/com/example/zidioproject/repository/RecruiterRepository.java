package com.example.zidioproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zidioproject.entity.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
	Recruiter findByRecruiterEmail(String recruiterEmail);

}
