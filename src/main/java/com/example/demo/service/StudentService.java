package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.StudentDTO;


@Service
public class StudentService {

	public String saveService(StudentDTO studentDTO) {
		return "Save";
	}

}
