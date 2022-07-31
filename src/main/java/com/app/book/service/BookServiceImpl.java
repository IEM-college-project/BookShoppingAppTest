package com.app.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.book.entity.Book;
import com.app.book.entity.Order;
import com.app.book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

@Autowired
BookRepository bookRepository;
	@Override
	public Book updateBookById(Long id, Book book)
	{
		Book book2=bookRepository.findById(id).orElse(null);
		if(book2!=null)
			return bookRepository.save(book);
		return null;
	}

	@Override
	public Book getBookById(Long id) 
	{
		return bookRepository.findById(id).orElse(null);

	}

}
