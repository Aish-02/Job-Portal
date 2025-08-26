package com.example.zidioproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zidioproject.dto.JobRequest;
import com.example.zidioproject.entity.Job;
import com.example.zidioproject.service.JobService;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
	@Autowired
	private JobService jobService;

	@PostMapping("/jobPost")
	public ResponseEntity<String> postJob(@RequestBody JobRequest request) {
		return ResponseEntity.ok(jobService.jobPost(request));
	}

	@GetMapping
	public ResponseEntity<List<Job>> getAllJobs() {
		return ResponseEntity.ok(jobService.getAllJobs());

	}

	@GetMapping("/search/title/{title}")
	public ResponseEntity<List<Job>> searchByTitle(@PathVariable String title) {
		return ResponseEntity.ok(jobService.seachByTitle(title));

	}

	@GetMapping("/search/companyName/{companyName}")
	public ResponseEntity<List<Job>> searchByCompanyName(@PathVariable String companyName) {
		return ResponseEntity.ok(jobService.searchByCompanyName(companyName));
	}

}
