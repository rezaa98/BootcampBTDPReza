package com.belajar.spring.generator;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.belajar.spring.entity.Book;
import com.belajar.spring.entity.BookCategory;
import com.belajar.spring.repository.BookCategoryRepository;

public class BookCategoryGenerator {

	Logger logger = Logger.getLogger(BookCategoryGenerator.class.getName());
	
	@Autowired
	private BookCategoryRepository bookCategoryRepository;
	
	public void displayBookCategory() {
		BookCategory bookCategory = bookCategoryRepository.save(
				new BookCategory("Programming",
				new Book("Java 1", "Teten N.", "SEI92002"), 
				new Book("Java 2", "Teten N.", "UEOEI829")));
		logger.log(Level.INFO, "bookCategory : " + bookCategory);
	}

}
