package com.example.zidioproject.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zidioproject.dto.UserInfoResponse;
import com.example.zidioproject.dto.UserStatusUpdateRequest;
import com.example.zidioproject.entity.UserInfo;
import com.example.zidioproject.repository.UserInfoRepository;

@Service
public class AdminService {
	@Autowired
	private UserInfoRepository userInfoRepository;

	public UserInfoResponse updateUserStatus(UserStatusUpdateRequest request) {

		UserInfo user = userInfoRepository.findByEmail(request.getEmail())
				.orElseThrow(() -> new RuntimeException("User not found"));

		user.setActive(request.isActive());
		UserInfo saved = userInfoRepository.save(user);
		return toResponse(saved);
	}

	public List<UserInfoResponse> getAllUsers() {
		return userInfoRepository.findAll().stream().map(this::toResponse).collect(Collectors.toList());
	}

	public List<UserInfoResponse> getUsersByRole(String role) {
		return userInfoRepository.findByRole(role.toUpperCase()).stream().map(this::toResponse)
				.collect(Collectors.toList());
	}

	public UserInfoResponse toResponse(UserInfo user) {
		return new UserInfoResponse(user.getEmail(), user.getRole(), user.isActive());
	}

}
