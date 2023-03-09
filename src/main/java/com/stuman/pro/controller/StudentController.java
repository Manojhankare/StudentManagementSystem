package com.stuman.pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stuman.pro.entity.Student;
import com.stuman.pro.services.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// handler method to handle student list and return model and view

	@GetMapping("/students")
	public String listStudent(Model model) {

		model.addAttribute("students", studentService.getAllStudents());

		return "students";

	}
	@GetMapping("/students/add")
	public String createStudentForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
	
		return "redirect:/students";		
	}
	
	@GetMapping("/student/update/{Id}")
	public String updateStudentForm(@PathVariable Long Id,  Model model) {
		model.addAttribute("student",studentService.getStudentById(Id));
		return "update";
}	
	@PostMapping("/students/update")
	public String updateStudent(@ModelAttribute("student") Student student, Model model) {
		studentService.saveStudent(student);

		Long Id = null;
		//get/fetch student data from database using id
		Student existingStudent= studentService.getStudentById(Id);
		existingStudent.setId(Id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setAddress(student.getAddress());
		
		//save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";		
	}


}

