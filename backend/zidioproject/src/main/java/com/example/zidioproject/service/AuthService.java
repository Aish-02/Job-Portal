package com.example.zidioproject.service;

import org.apache.catalina.filters.RemoteIpFilter.XForwardedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.zidioproject.dto.LoginRequest;
import com.example.zidioproject.dto.RegisterRequest;
import com.example.zidioproject.entity.User;
import com.example.zidioproject.repository.UserRepository;
import com.example.zidioproject.security.JWTUtil;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@Service
public class AuthService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	public String register(RegisterRequest request){
		User user = new User();
		user.setName(request.name);
		user.setEmail(request.email);
		user.setPassword(passwordEncoder.encode(request.password));
		user.setRole(request.role);
		userRepository.save(user);
		return "User Registered Successfully";
	}
	
	public String login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not Found"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid Password");
        }

        return jwtUtil.generateToken(user.getEmail());
    }

}
