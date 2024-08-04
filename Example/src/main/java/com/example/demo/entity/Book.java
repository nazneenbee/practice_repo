package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="booktable")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer bookId;
	String bookName;
	String writerName;
	Float bookPrice;
	@ManyToOne
	@JoinColumn(name="studentId")
	Student student;
	/*
	 * public Integer getBookId() { return bookId; } public void setBookId(Integer
	 * bookId) { this.bookId = bookId; } public String getBookName() { return
	 * bookName; } public void setBookName(String bookName) { this.bookName =
	 * bookName; } public String getWriterName() { return writerName; } public void
	 * setWriterName(String writerName) { this.writerName = writerName; } public
	 * float getBookPrice() { return bookPrice; } public void setBookPrice(float
	 * bookPrice) { this.bookPrice = bookPrice; } public Book(Integer bookId, String
	 * bookName, String writerName, float bookPrice) { super(); this.bookId =
	 * bookId; this.bookName = bookName; this.writerName = writerName;
	 * this.bookPrice = bookPrice; }
	 * 
	 * @Override public String toString() { return "Book [bookId=" + bookId +
	 * ", bookName=" + bookName + ", writerName=" + writerName + ", bookPrice=" +
	 * bookPrice + "]"; }
	 */

}
