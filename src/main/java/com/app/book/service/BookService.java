package com.app.book.service;

import org.springframework.stereotype.Service;

import com.app.book.entity.Book;

@Service
public interface BookService {
	// public void addABook();

	public Book getABook();

}
