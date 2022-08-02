package com.app.book.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.book.entity.Book;
import com.app.book.service.BookService;

@RestController
@RequestMapping("/bookAPI")
public class BookController {
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/getABook/{id}")
	public ResponseEntity<Book> getBookbyId(@PathVariable Long id ) {
		Book book = bookService.getABook(id);	
		return ResponseEntity.ok(book);
	}
	
	@GetMapping("/getallBooks")
	public List<Book> getAllEmployee(){
		return bookService.getAllBooks();
	}
	
	@PostMapping("/createABook")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		 bookService.saveBook(book);
		 return ResponseEntity.ok(book);
	}
	
	@DeleteMapping("/deleteABook/{id}")
	public ResponseEntity<String> deleteABook(@PathVariable Long id){
		bookService.deleteABook(id);
		return  new ResponseEntity<>("Book deleted", HttpStatus.OK);
	}
}

