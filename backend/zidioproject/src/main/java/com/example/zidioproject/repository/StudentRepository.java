package com.example.zidioproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.zidioproject.entity.StudentProfile;

public interface StudentRepository extends JpaRepository<StudentProfile, Long> {
	Optional<StudentProfile> findByEmail(String email);

}
