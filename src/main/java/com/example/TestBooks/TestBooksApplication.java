package com.example.TestBooks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.TestBooks.repository.BookRepository;
import com.example.TestBooks.model.Book;
@SpringBootApplication
public class TestBooksApplication  implements CommandLineRunner{
@Autowired
BookRepository bookRepository;
	public static void main(String[] args) {
		SpringApplication.run(TestBooksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		List<Book>listOfBooks =new ArrayList<Book>();
		Book b1= new Book("RunTimeException","MD Verma","Md publisers", 520);
		Book b2= new Book("The Exception","Mc Sharma","V&S Publication", 320);
		Book b3= new Book("ThrowException","NH Verma","LocaL Publication", 920);
		Book b4= new Book("Time Class","WD Verma","Publication Portal", 720);
		Book b5= new Book("RunTime  Process","McD Tuma","Master publiCation", 120);
		listOfBooks.add(b1);
		listOfBooks.add(b2);	listOfBooks.add(b3);	listOfBooks.add(b4);	listOfBooks.add(b5);
		bookRepository.insert(listOfBooks);
	}

}
