package com.example.TestBooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TestBooks.model.Book;
import com.example.TestBooks.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public List<Book> getAll() {
		return  bookRepository.findAll();
}

	public Book addBook(Book bk) {
		return bookRepository.insert(bk);
	}

	public Book update(Book bk) {
	
		return bookRepository.save(bk);
	}

	public void delete(String id) {
		
	 bookRepository.deleteById(id);
	}
}