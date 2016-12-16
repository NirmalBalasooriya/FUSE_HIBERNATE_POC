package com.vcc.poc.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.vcc.poc.model.Student;

public interface StudentDao {
	
	@Transactional
	public Student getStudent(int id);
	
	@Transactional
	public List<Student> findStudent();
	
	@Transactional
	public void saveStudent(Student student);
}
