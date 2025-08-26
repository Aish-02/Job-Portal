package com.example.zidioproject.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zidioproject.dto.ApplicationRequest;
import com.example.zidioproject.dto.ApplicationResponse;
import com.example.zidioproject.entity.Application;
import com.example.zidioproject.repository.ApplicationRepository;

@Service
public class ApplicationService {
	@Autowired
	private ApplicationRepository applicationRepository;

	public ApplicationResponse apply(ApplicationRequest request){
	   applicationRepository.findByStudentEmailAndJobId(request.getStudentEmail(),request.getJobId()).
	                       ifPresent(a->{throw new RuntimeException("Already applied");});


	   Application app = new Application();
	   app.setStudentEmail(request.getStudentEmail());
	   app.setJobId(request.getJobId());
	   app.setStatus("applied");

	app = applicationRepository.save(app);
	return mapToResponse(app);
	}

	public List<ApplicationResponse> getApplicationsByStudent(String studentEmail) {
		return applicationRepository.findByStudentEmail(studentEmail)
				.stream().map(this::mapToResponse)
				.collect(Collectors.toList());
	}

	public List<ApplicationResponse> getApplicationByJob(Long jobId) {
		return applicationRepository.findByJobId(jobId)
				.stream().map(this::mapToResponse)
				.collect(Collectors.toList());
	}

	private ApplicationResponse mapToResponse(Application app) {
		return new ApplicationResponse(app.getId(), app.getStudentEmail(),
				app.getJobId(), app.getStatus());
	}

}
