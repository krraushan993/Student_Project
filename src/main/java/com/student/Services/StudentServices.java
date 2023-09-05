package com.student.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.student.Entity.Student;

@Service
public class StudentServices {

	private static List<Student> list = new ArrayList<>();

	public Student addStudent(Student student2) {
		list.add(student2);
		return student2;
	}

	// Retrieve all students
	public List<Student> getAllStudents() {
		return list;
	}
}
