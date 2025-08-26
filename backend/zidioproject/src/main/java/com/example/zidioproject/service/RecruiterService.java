package com.example.zidioproject.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zidioproject.dto.JobRequest;
import com.example.zidioproject.dto.RecruiterRequest;
import com.example.zidioproject.entity.Job;
import com.example.zidioproject.entity.Recruiter;
import com.example.zidioproject.repository.JobRepository;
import com.example.zidioproject.repository.RecruiterRepository;

@Service
public class RecruiterService {
	@Autowired
	private RecruiterRepository recruiterRepository;
	
	@Autowired
	private JobRepository jobRepository;
	
	public RecruiterRequest saveRecruiter(RecruiterRequest request) {
		Recruiter recruiter=new Recruiter();
		recruiter.setRecruiterName(request.recruiterName);
		recruiter.setCompanyName(request.companyName);
		recruiter.setRecruiterEmail(request.recruiterEmail);
		recruiter.setDesignation(request.designation);
		
		Recruiter saved = recruiterRepository.save(recruiter);
		
		RecruiterRequest response = new RecruiterRequest();
		BeanUtils.copyProperties(saved, response);
		return response;
	}
	
	public List<RecruiterRequest>getAllRecruiters(){
		return recruiterRepository.findAll().stream().map(r ->{
			RecruiterRequest dto = new RecruiterRequest();
			BeanUtils.copyProperties(r, dto);
			return dto;
		}).collect(Collectors.toList());
	}
	public RecruiterRequest getByRecruiterEmail(String recruiterEmail) {
		Recruiter recruiter =recruiterRepository.findByRecruiterEmail(recruiterEmail); 
		if(recruiter==null)throw new RuntimeException("Recruiter not found");
		
		RecruiterRequest response = new RecruiterRequest();
        BeanUtils.copyProperties(recruiter, response);
        return response;
	}
	
	
	public Recruiter saveProfile(Recruiter r){
		return recruiterRepository.save(r);
		}

		public Job postJob(JobRequest request){
		   Job job = new Job();

		  job.setTitle(request.title);
		  job.setDescription(request.description);
		  job.setJobType(request.jobType);
//		  job.setlocalDate(request.localDate);
		  job.setLocation(request.location);

		  return jobRepository.save(job); 
		} 

		public List<Job>getPostedJob(String recruiterEmail){
		 return jobRepository.findByPostedBy(recruiterEmail);
		}

		public List<Job> gtAllJobs(){
		return jobRepository.findAll();
		}


}
