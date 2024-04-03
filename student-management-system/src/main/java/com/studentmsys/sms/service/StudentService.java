package com.studentmsys.sms.service;

import java.util.List;

import com.studentmsys.sms.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudemtById(Long id);
	
	
}


