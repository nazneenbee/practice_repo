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

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("hello")
	public String helloAll()
	{
		return "finally springboot demo created after two days hardwork";
		
	}
	
	@PostMapping("savebook")
	public Book saveBook(@RequestBody Book book)
	{
		System.out.println("save book");
		return bookService.saveBook(book);
		
	}
	
	@GetMapping("getbook")
	public Optional<Book> getBook(@RequestParam("bookId") Integer bookId)
	{
		return bookService.getBook(bookId);
		
	}
	
	@GetMapping("getallbook")
	public List<Book> getAllBook()
	{
		return bookService.getAllBook();
		
	}

	@DeleteMapping("deletebook/{bookId}")
	public String deleteBook(@PathVariable("bookId") Integer bookId) 
	{
		System.out.println("delete book");
		return bookService.deleteBook(bookId);
	}
	
	@PutMapping("updatebook")
	public Book updateBook(@RequestBody Book book)
	{
		return bookService.updateBook(book);
		
	}

	@GetMapping("gethighpricebook")
	public Float getHighPriceBook() {
		// TODO Auto-generated method stub
		return bookService.getHighPriceBook();
	}
	
	@GetMapping("getprizebookwithdetail")
	public List<Book> getHighPriceBookDetail() {
		// TODO Auto-generated method stub
		return bookService.getHighPriceBookDetail();
	}

}
