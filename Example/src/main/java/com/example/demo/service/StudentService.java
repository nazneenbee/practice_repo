package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Optional<Student> getStudentById(Integer studentId);
	public List<Student> getAllStudent();
	public Student updateStudent(Student student);
	public void deleteStudent(Integer studentId);
	

}
