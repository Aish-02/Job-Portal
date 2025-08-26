package com.example.zidioproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.zidioproject.dto.LoginRequest;
import com.example.zidioproject.dto.RegisterRequest;
import com.example.zidioproject.security.JWTUtil;
import com.example.zidioproject.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	    @Autowired
	    private AuthService authService;
	    
	    @Autowired
	    private JWTUtil jwtUtil;

	    @PostMapping("/register")
	    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
	        return ResponseEntity.ok(authService.register(request));
	    }

	    @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
	        return ResponseEntity.ok(authService.login(request));
	    }
	    
	    @GetMapping("/validate")
	    public ResponseEntity<String>validate(@RequestParam String token){
	    boolean isValid=jwtUtil.validateToken(token);
	    return isValid?ResponseEntity.ok("Valid Token"):ResponseEntity.status(401).body("Invalid Token");
	    }


}
