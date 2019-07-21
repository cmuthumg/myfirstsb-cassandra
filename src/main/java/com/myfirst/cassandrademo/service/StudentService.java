package com.myfirst.cassandrademo.service;

import java.util.List;

import com.myfirst.cassandrademo.model.Student;

public interface StudentService {
	
	public Student getStudent(int id);
	
	List<Student> getStudents();

}
