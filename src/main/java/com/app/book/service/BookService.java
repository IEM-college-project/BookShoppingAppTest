package com.app.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.book.entity.Book;

@Service
public interface BookService {

	public Book getABook(long id);

	public List<Book> getAllBooks();

	public Book createBook(Book book);

	public void deleteABook(long id);

	public Book updateBookById(Long id, Book book);

}
