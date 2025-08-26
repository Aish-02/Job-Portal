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
import com.example.zidioproject.dto.RecruiterRequest;
import com.example.zidioproject.entity.Job;
import com.example.zidioproject.entity.Recruiter;
import com.example.zidioproject.service.RecruiterService;

@RestController
@RequestMapping("/api/recruiter")
public class RecruiterController {
	@Autowired 
	private RecruiterService recruiterService;

	@PostMapping("/register")

	public ResponseEntity<RecruiterRequest> register (@RequestBody RecruiterRequest request){
	      return ResponseEntity.ok(recruiterService.saveRecruiter(request));
	  }

	@GetMapping ("/all")

	public ResponseEntity<List<RecruiterRequest>>getAll(){
	 return ResponseEntity.ok(recruiterService.getAllRecruiters());
	}

	@GetMapping({"/email/{recruiterEmail}"})
	public ResponseEntity<RecruiterRequest> getByRecruiterEmail(@PathVariable String recruiterEmail) {
	    return ResponseEntity.ok(recruiterService.getByRecruiterEmail(recruiterEmail));
	}

	
	@PostMapping("/profile")

	public ResponseEntity<Recruiter>saveProfile(@RequestBody Recruiter dto){
	    return ResponseEntity.ok(recruiterService.saveProfile(dto));
	}

	@PostMapping("/job")
	public ResponseEntity<Job>postJobs(@RequestBody JobRequest request){
	 return ResponseEntity.ok(recruiterService.postJob(request));
	}

	@GetMapping("/jobs/{email}")
	public ResponseEntity<List<Job>>getPostedJob(@PathVariable String email){
	return ResponseEntity.ok(recruiterService.getPostedJob(email));
	}
	
	@GetMapping("/jobs")
	public ResponseEntity<List<Job>>gtAllJobs(){
	 return ResponseEntity.ok(recruiterService.gtAllJobs());
	}
	

}
