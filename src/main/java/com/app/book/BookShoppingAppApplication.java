package com.app.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.book.entity.Book;
import com.app.book.repository.BookRepository;
import com.app.book.service.BookServiceImpl;

@SpringBootApplication
public class BookShoppingAppApplication implements CommandLineRunner {
	public static BookServiceImpl bookServiceImpl=new BookServiceImpl();
	@Autowired
	public BookRepository bookRepository;
	public static List<Book> b=new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(BookShoppingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		b.add(new Book(1L, "JAVA", "Amitava", 5000));
		b.add(new Book(2L, "PYTHON", "Anuska", 10000));
		bookRepository.saveAll(b);
		
		System.out.println(bookServiceImpl.getABook(2));
		System.out.println(bookServiceImpl.getAllBook());
		// bookRepository.save(new Book(1L, "JAVA", "Amitava", 5000));

		// TODO Auto-generated method stub

	}

}
