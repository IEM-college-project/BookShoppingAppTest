package com.app.book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BookShoppingAppApplication {

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

}