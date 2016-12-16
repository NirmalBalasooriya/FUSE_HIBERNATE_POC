package com.vcc.poc.service.impl;

import java.util.List;

import com.vcc.poc.dao.StudentDao;
import com.vcc.poc.model.Student;
import com.vcc.poc.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	public Student getStudent(int id) {
		
		return getStudentDao().getStudent(id);
	}

	public List<Student> findStudent() {

		return getStudentDao().findStudent();
	}

	public void saveStudent(Student student) {
		try {
			getStudentDao().saveStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
