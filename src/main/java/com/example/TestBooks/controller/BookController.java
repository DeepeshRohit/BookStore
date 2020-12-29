package com.example.TestBooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestBooks.model.Book;
import com.example.TestBooks.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService booksService;
	
	@GetMapping("/")
	public List<Book>getAll(){
		return booksService.getAll();
		
		
	}
	@PostMapping("/")
	public Book addBook(@RequestBody Book bk){
		return booksService.addBook(bk);
	}
	@PutMapping("/")
	public Book update(@RequestBody Book bk){
		return booksService.update(bk);
	}
		@DeleteMapping("/{id}")
	public void delete(@RequestParam("id") String id){
		 booksService.delete(id);
	}
	
}
