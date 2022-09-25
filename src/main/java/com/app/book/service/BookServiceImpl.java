package com.app.book.service;

/*
 * 
 */
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.book.entity.Book;
import com.app.book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	/*
	 * Created a constructor of BookRepository class by using
	 * 
	 * @Autowired to get the methods of Interface JpaRepository.
	 */
	@Autowired
	private BookRepository bookRepository;

	/*
	 * Creating a book in a database.
	 */
	@Override
	public Book createBook(Book book) {
		Book book2 = bookRepository.save(book);
		return book2;
	}

	/*
	 * Fetching a book info using by its id.
	 */
	@Override
	public Book getABook(long id) {
		Optional<Book> optional = bookRepository.findById(id);
		Book book = null;
		if (optional.isPresent()) {
			book = optional.get();
		} else {
			throw new RuntimeException("Book not found");
		}
		return book;
	}

	/*
	 * Updating a book by its id.
	 */
	@Override
	public Book updateBookById(Long id, Book book) {
		Book book2 = bookRepository.findById(id).orElse(null);
		if (book2 != null) {
			book2.setName(book.getName());
			book2.setAuthor(book.getAuthor());
			book2.setPrice(book.getPrice());
			return bookRepository.save(book2);
		}
		return null;
	}

	/*
	 * Fetching all books list.
	 */
	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	/*
	 * Deleting a book by its id.
	 */
	@Override
	public void deleteABook(long id) {
		Book book = getABook(id);
		bookRepository.delete(book);
	}

}
