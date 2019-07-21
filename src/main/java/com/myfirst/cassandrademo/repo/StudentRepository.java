package com.myfirst.cassandrademo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myfirst.cassandrademo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{
	
	Student findByStuId(int id);

}
