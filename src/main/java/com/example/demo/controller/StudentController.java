package com.example.demo.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.StudentDTO;
import com.example.demo.service.StudentService;

// diff between Controller and RestController 
// RestController = Controller +  ResponseBody
@RestController
public class StudentController {

	
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/demo/{firstNum}/{secondNum}")
	public String hello(@PathVariable("firstNum") int a, @PathVariable("secondNum") int b) {

		List<Integer> aaa = List.of(1, 3, 56, 7, 8, 6, 5, 4);

		return "Hi, I'm Working!! and sum  = " + (a + b);
	}

	@GetMapping("/demo1")
	public String hello32() {
		return "Hi, I'm Working3!!";
	}

	@GetMapping("/demo3")
	public String hel234lo() {
		return "Hi, I'm Working3!!";
	}

	@GetMapping("/{operation}/{firstNum}/{secondNum}")
	public String common(@PathVariable("firstNum") int a, @PathVariable("secondNum") int b) {
		return "Hi, I'm Working3!!";
	}

	// Data Transfer Object

	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody StudentDTO studentDTO) {
		System.out.println("value of student sertvice is "+ studentService);

		if (ObjectUtils.isEmpty(studentDTO) || StringUtils.isBlank(studentDTO.getName())) {
			System.out.println("SOMETHING IS WRONG IN REQUEST ");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("SOMETHING IS WRONG IN REQUEST ");
		}

		

		System.out.println("NEW OBJECT CREATED");
		studentService.saveService(studentDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("SAVE");
	}

}
