package com.example.zidioproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zidioproject.dto.StudentDto;
import com.example.zidioproject.entity.StudentProfile;
import com.example.zidioproject.entity.User;
import com.example.zidioproject.repository.StudentRepository;
import com.example.zidioproject.repository.UserRepository;

@Service
public class StudentService {
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public String createOrUpdate(StudentDto dto) {
		User user = userRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found for email: " + dto.getEmail()));
		StudentProfile student = studentRepository.findByEmail(dto.email).orElse(new StudentProfile());
		student.setUser(user); 
		student.setName(dto.getName());
		student.setEmail(dto.getEmail());
		student.setCourse(dto.getCourse());
		student.setUniversity(dto.getUniversity());
		student.setResumeUrl(dto.getResumeUrl());
		studentRepository.save(student);

		return "Student Profile saved successfully";

	}

	public StudentDto getProfile(String email) {
		StudentProfile s = studentRepository.findByEmail(email).orElseThrow();
		StudentDto dto = new StudentDto();
		dto.name = s.getName();
		dto.email = s.getEmail();
		dto.course = s.getCourse();
		dto.university = s.getUniversity();
		dto.resumeUrl = s.getResumeUrl();
		return dto;
	}

}
