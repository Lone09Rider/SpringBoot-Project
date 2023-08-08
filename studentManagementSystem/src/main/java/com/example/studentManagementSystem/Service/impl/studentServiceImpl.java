package com.example.studentManagementSystem.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentManagementSystem.Entity.Student;
import com.example.studentManagementSystem.Repository.studentRepository;
import com.example.studentManagementSystem.Service.studentService;

@Service
public class studentServiceImpl implements studentService {

	private studentRepository repository;
	
	public studentServiceImpl(studentRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		repository.deleteById(id);
	}

}
