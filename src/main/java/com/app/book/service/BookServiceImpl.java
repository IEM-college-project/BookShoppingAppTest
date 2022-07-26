package com.app.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.book.BookShoppingAppApplication;
import com.app.book.entity.Book;

@Service
public class BookServiceImpl implements BookService {
	

	@Override
	public Book getABook(long id) {
		Book book=null;
		List<Book> allBooks=BookShoppingAppApplication.b;
		
		for (Book e : allBooks) {
			if (e.getId() == id) {
				book = e;
				break;
			}
		}
		// TODO Auto-generated method stub
		return book;
	}

	@Override
	public List<Book> getAllBook() {
		 List<Book> allBooks=BookShoppingAppApplication.b;
		// TODO Auto-generated method stub
		return allBooks;
	}
	

}
