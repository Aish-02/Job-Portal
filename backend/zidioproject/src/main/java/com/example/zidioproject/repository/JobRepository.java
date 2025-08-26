package com.example.zidioproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zidioproject.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long>{
	List<Job> findByCompanyName(String name);
	List<Job> findByTitle(String title);
	List<Job> findByPostedBy(String recruiterEmail);

}
