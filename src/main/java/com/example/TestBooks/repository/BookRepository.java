package com.example.TestBooks.repository;
 import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.TestBooks.model.Book;
 @Repository
public interface BookRepository extends MongoRepository<Book ,String>{

}
