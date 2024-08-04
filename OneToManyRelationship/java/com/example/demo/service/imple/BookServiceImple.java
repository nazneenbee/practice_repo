package com.example.demo.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepository;
import com.example.demo.service.BookService;

@Service
public class BookServiceImple implements BookService{
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		if(book.equals(null))
		{
			System.out.println("no book are available");
		}
		return bookRepository.save(book);
	}

	@Override
	public Optional<Book> getBook(Integer bookId) {
		 return bookRepository.findById(bookId);
		
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> bookList=bookRepository.findAll();
		return bookList;
	}

	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookId);
		return "delete book";
		
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		Optional<Book> book1= bookRepository.findById(book.getBookId());
		if(book1.isPresent())
		{
			Book book2= bookRepository.findById(book.getBookId()).get();
			book2.setBookId(book.getBookId());
			book2.setBookName(book.getBookName());
			book2.setWriterName(book.getWriterName());
			book2.setBookPrice(book.getBookPrice());
			Book book3=bookRepository.save(book2);
			return book3;
		}
		else
		{
		throw new NullPointerException();
		}
	}

	@Override
	public Float getHighPriceBook() {
		// TODO Auto-generated method stub
		return bookRepository.getHighPriceBook();
	}

	@Override
	public List<Book> getHighPriceBookDetail() {
		// TODO Auto-generated method stub
		return bookRepository.getHighPriceBookDetail();
	}
}
