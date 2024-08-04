package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	//Query in SQL
	/* 
	 * @Query(
	 * value="select * from booktable b where b.book_price=(select max(book_price) from booktable b)"
	 * , nativeQuery=true) public List<Book> getHighPriceBookDetail();
	 */
	 

	
	
	  @Query("select b from Book b where b.bookPrice=(select max(bookPrice) from Book b)"
	  ) public List<Book> getHighPriceBookDetail();
	 
	 
	@Query("select max(bookPrice) from Book b")
	public Float getHighPriceBook();
	
}
