package com.app.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.book.entity.Book;
import com.app.book.repository.BookRepository;

@SpringBootApplication
public class BookShoppingAppApplication implements CommandLineRunner {
	@Autowired
	public BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookShoppingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Book> b = new ArrayList<Book>();
		b.add(new Book(1L, "JAVA", "Amitava", 5000));
		b.add(new Book(2L, "PYTHON", "Arpan", 10000));
		bookRepository.saveAll(b);
		// bookRepository.save(new Book(1L, "JAVA", "Amitava", 5000));

		// TODO Auto-generated method stub

	}

}
