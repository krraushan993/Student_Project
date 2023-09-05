package com.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Entity.Student;
import com.student.Services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServices studentServices;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student)
	{
		Student s = this.studentServices.addStudent(student);
		return student;	
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentServices.getAllStudents();
	}
}
