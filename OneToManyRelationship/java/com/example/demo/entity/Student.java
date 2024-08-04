package com.example.demo.entity;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "studentinfo")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer studentId;
	String studentName;
	@OneToMany(mappedBy="student")
    List<Book> book;

}
