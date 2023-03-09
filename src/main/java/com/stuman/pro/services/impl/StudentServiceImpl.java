package com.stuman.pro.services.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.stuman.pro.entity.Student;
import com.stuman.pro.repository.StudentRepository;
import com.stuman.pro.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
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
	public Student getStudentById(Long Id) {
		
		return studentRepository.findById(Id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
}
