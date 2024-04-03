package com.studentmsys.sms.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.studentmsys.sms.entity.Student;
import com.studentmsys.sms.repository.StudentRepositry;
import com.studentmsys.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService  {

	private StudentRepositry studentRepository;
	
	
	public StudentServiceImpl(StudentRepositry studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudemtById(Long id) {
		
		studentRepository.deleteById(id);
		
	}
	
	 
}
