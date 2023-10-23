package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	public Student addStudent(Student student) {
		repo.save(student);
		return student;
	}
	
	public Optional<Student> delStudent(int usn) {
		Optional<Student> student = repo.findById(usn);
		repo.deleteById(usn);
		return student;
	}
	
	public Student updateStudent(int usn, Student student){
		if(repo.existsById(usn)){
			
			Student newStudent = new Student();
			newStudent.setUsn(usn);
			newStudent.setName(student.getName());
			newStudent.setBranch(student.getBranch());
			repo.save(newStudent);
			return newStudent;
		}
		else {
			return null;
		}
	}
	
	public Optional<Student> getStudent(int usn){
		Optional<Student> student = repo.findById(usn);
		return student;
	}

}
