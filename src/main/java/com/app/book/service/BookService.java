package com.app.book.service;

import org.springframework.stereotype.Service;

import com.app.book.entity.Book;
import com.app.book.entity.Customer;

@Service
public interface BookService {
	// public void addABook();

	public Book getBookById(Long id);
	public Book updateBookById(Long id, Book book);

}
