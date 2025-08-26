package com.example.zidioproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zidioproject.dto.JobRequest;
import com.example.zidioproject.entity.Job;
import com.example.zidioproject.repository.JobRepository;

@Service
public class JobService {
	@Autowired
	private JobRepository jobRepository;

	public String jobPost(JobRequest request){
	  Job job = new Job();
	  job.setTitle(request.title);
	job.setDescription(request.description);
	job.setCompanyName(request.companyName);
	job.setLocation(request.location);
	job.setJobType(request.jobType);
	job.setDuration(request.duration);
	job.setSkills(request.skills);
	job.setPostedBy(request.postedBy);

	jobRepository.save(job);

	return "Job post got saved";
	}

	public List<Job>getAllJobs(){
	 return jobRepository.findAll();
	}
	public List<Job>seachByTitle(String title){
		return jobRepository.findByTitle(title);
	}
	public List<Job>searchByCompanyName(String companyName){
	return jobRepository.findByCompanyName(companyName);
	}


}
