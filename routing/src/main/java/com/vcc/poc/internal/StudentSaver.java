package com.vcc.poc.internal;

import java.text.ParseException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.vcc.poc.model.Student;

import com.vcc.poc.service.StudentService;

public class StudentSaver   implements Processor{
	private StudentService studentService = null;

	@Override
	public void process(Exchange exchange) throws ParseException{
		Student student=new Student();
		student.setStudentId(1);
		student.setGivenName("Nirmal");
		student.setFamilyName("Balasooriya");
		//studentService.saveStudent(student);
		student=studentService.getStudent(1);
		
		exchange.getOut().setBody("MY Content!!!"+student.toString());
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
