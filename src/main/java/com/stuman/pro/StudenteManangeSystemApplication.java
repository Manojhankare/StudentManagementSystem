package com.stuman.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stuman.pro.entity.Student;
import com.stuman.pro.repository.StudentRepository;

@SpringBootApplication
public class StudenteManangeSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudenteManangeSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("manoj", "hankare", "manoj@gmail.com", "A'bad");
//		studentRepository.save(student1);
//		Student student2 = new Student("John", "D", "John@gmail.com", "NewYork");
//		studentRepository.save(student2);
//		Student student3 = new Student("John", "Wick", "wick@gmail.com", "London");
//		studentRepository.save(student3);
	}

}
