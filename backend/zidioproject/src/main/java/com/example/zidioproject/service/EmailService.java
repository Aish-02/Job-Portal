//package com.example.zidioproject.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.zidioproject.dto.EmailRequest;
//import com.example.zidioproject.entity.SimpleMailMessage;
//
//@Service
//public class EmailService {
//	@Autowired
//	private JavaEmailSender mailSender;
//	
//	public String sendEmail(EmailRequest request) {
//		SimpleMailMessage message=new SimpleMailMessage();
//		message.setTo(request.to);
//		message.setSubject(request.subject);
//		message.setText(request.message);
//		message.setFrom("aishwarya.bhattalwar@gmail.com");
//		message.send(message);
//		return "Email send successfully";
//	}

//}
