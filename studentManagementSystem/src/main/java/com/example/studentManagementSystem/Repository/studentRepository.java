package com.example.studentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentManagementSystem.Entity.Student;

public interface studentRepository extends JpaRepository<Student, Long> {

}
