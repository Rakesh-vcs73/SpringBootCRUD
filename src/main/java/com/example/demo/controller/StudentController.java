package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		service.addStudent(student);
		return student;
		
	}
	
	@GetMapping("/student/{usn}")
	public Optional<Student> getStudent(@PathVariable("usn") int usn){
		Optional<Student> student = service.getStudent(usn);
		return student;
	}
	
	@DeleteMapping("/student/{usn}")
	public Optional<Student> delStudent(@PathVariable("usn") int usn) {
		Optional<Student> student = service.delStudent(usn);
		return student;
	}
	
	@PostMapping("/student/{usn}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("usn") int usn){
		Student updatedstudent = service.updateStudent(usn,student);
		return updatedstudent;
	}
	
	
	
	

}
