package com.studentmsys.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmsys.sms.entity.Student;


public interface StudentRepositry extends JpaRepository<Student, Long> {

	
}
