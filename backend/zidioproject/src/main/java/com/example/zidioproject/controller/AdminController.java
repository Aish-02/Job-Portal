package com.example.zidioproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zidioproject.dto.UserInfoResponse;
import com.example.zidioproject.dto.UserStatusUpdateRequest;
import com.example.zidioproject.entity.UserInfo;
import com.example.zidioproject.repository.UserInfoRepository;
import com.example.zidioproject.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@PostMapping("/user/add")
	public UserInfoResponse addUser(@RequestBody UserInfo user) {
	    return adminService.toResponse(userInfoRepository.save(user));
	}

	@PutMapping("/user/status")

	public UserInfoResponse updateUserStatus(@RequestBody UserStatusUpdateRequest request) {
		return adminService.updateUserStatus(request);
	}

	@GetMapping("/users")

	public List<UserInfoResponse> getAllUsers() {
		return adminService.getAllUsers();
	}

	@GetMapping("/users/{role}")
	public List<UserInfoResponse> getUserByRole(@PathVariable String role) {
		return adminService.getUsersByRole(role);
	}

}
