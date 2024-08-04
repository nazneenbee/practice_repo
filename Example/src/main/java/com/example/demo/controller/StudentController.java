package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("api")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("savestudent")
	public Student saveStudent(@RequestBody Student student) {
		// TODO Auto-generated method stub
		return studentService.saveStudent(student);
	}
	
	@GetMapping("findstudentbyid/{studentId}")
	public Student findStudentById(@PathVariable Integer studentId)
	{
		return studentService.getStudentById(studentId).get();
	}
	
	@GetMapping("findallstudent")
	public List<Student> findAllStudent()
	{
		return studentService.getAllStudent();
		
	}
	
	@PutMapping("updatestudent")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.updateStudent(student);
		
	}
	
	@DeleteMapping("deletestudent")
	public void deleteStudent(@RequestParam Integer studentId)
	{
		studentService.deleteStudent(studentId);
	}
}
