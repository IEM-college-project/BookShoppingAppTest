package com.app.book.service;

import org.springframework.stereotype.Service;

import com.app.book.entity.Book;
import com.app.book.entity.Customer;

@Service
public interface BookService {

	public Book getABook(long id);
	public List<Book> getAllBooks();
	Book saveBook(Book book);
	void deleteABook(long id);

}

