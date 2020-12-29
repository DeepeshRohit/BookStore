package com.example.TestBooks.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
		@Id
		private String id;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public String getPublication() {
			return publication;
		}
		public void setPublication(String publication) {
			this.publication = publication;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		private String bookName;
		private String authorName;
		private String publication;
		private int price;
		public Book(String bookName, String authorName, String publication, int price) {
			super();
			this.bookName = bookName;
			this.authorName = authorName;
			this.publication = publication;
			this.price = price;
		}
		public Book() {
			super();
			
		}
}
