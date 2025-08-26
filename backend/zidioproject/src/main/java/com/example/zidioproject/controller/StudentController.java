package com.example.zidioproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zidioproject.dto.StudentDto;
import com.example.zidioproject.service.StudentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/profile")
	public ResponseEntity<String>save(@RequestBody StudentDto dto){
	return ResponseEntity.ok(studentService.createOrUpdate(dto));
	}
	@GetMapping("profile/{email}")
	public ResponseEntity<StudentDto>get(@PathVariable String email){
	return ResponseEntity.ok(studentService.getProfile(email));
	}


}
