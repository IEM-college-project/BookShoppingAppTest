package com.app.book.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.book.entity.Book;
import com.app.book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
    @Autowired
	private BookRepository bookRepository;
    
    @Override
	public Book getABook(long id) {
		Optional<Book> optional = bookRepository.findById(id);
		Book book = null;
		if(optional.isPresent()) {
			book = optional.get();
		}else {
			throw new RuntimeException("Book not found");
		}
		return book;
    }

	@Override
	public Book updateBookById(Long id, Book book)
	{
		Book book2=bookRepository.findById(id).orElse(null);
		if(book2!=null) {
			book2.setName(book.getName());
			book2.setAuthor(book.getAuthor());
			book2.setPrice(book.getPrice());
			return bookRepository.save(book2);
		}
		return null;
	}
    
    @Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteABook(long id) {
		Book book = getABook(id);
		bookRepository.delete(book);
	}

}
