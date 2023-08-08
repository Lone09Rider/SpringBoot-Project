package com.example.studentManagementSystem.Service;

import java.util.List;

import com.example.studentManagementSystem.Entity.Student;

public interface studentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudent(Long id);
}
