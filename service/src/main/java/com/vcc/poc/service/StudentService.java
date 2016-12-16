package com.vcc.poc.service;

import java.util.List;

import com.vcc.poc.model.Student;

public interface StudentService {
	public Student getStudent(int id);
	
	public List<Student> findStudent();
	
	public void saveStudent(Student student);
}
