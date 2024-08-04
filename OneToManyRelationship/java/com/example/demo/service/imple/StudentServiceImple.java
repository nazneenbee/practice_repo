package com.example.demo.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Optional<Student> student1= studentRepository.findById(student.getStudentId());
		if(student1.isPresent())
		{
		         Student student2= studentRepository.findById(student.getStudentId()).get();
		         student2.setStudentName(student.getStudentName());
		         student2.setBook(student.getBook());
		         return studentRepository.save(student2);
		}
		else {
		throw new NullPointerException();
		}
		
	}

	@Override
	public void deleteStudent(Integer studentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);
        		
	}

	

}
