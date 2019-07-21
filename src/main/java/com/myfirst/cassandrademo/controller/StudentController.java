package com.myfirst.cassandrademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myfirst.cassandrademo.model.Student;
import com.myfirst.cassandrademo.service.StudentService;

@RestController
@RequestMapping("/cassandra")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/hello")
	public String hello() {
		return "Hello Cassandra";
	}

	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudent(id);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

}
