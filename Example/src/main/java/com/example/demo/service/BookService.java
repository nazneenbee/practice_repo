package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Book;

public interface BookService{
	
	public Book saveBook(Book book);
	public Optional<Book> getBook(Integer bookId);
	public List<Book> getAllBook();
	public String deleteBook(Integer bookId);
	public Book updateBook(Book book);
	public Float getHighPriceBook();
	public List<Book> getHighPriceBookDetail();
	

}
