package com.app.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.book.entity.Book;

@Service
public interface BookService {

	public Book getABook(long id);
	public List<Book> getAllBooks();
	Book saveBook(Book book);
	void deleteABook(long id);

}

