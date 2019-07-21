package com.myfirst.cassandrademo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfirst.cassandrademo.model.Student;
import com.myfirst.cassandrademo.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getStudent(int id) {
		return studentRepository.findByStuId(id);
	}

	@Override
	public List<Student> getStudents() {
		return (List<Student>) studentRepository.findAll();
	}

}
