package com.app.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mybooks")

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private long id;
	@Column(name = "book_name", length = 20, nullable = false, unique = true)
	private String name;
	@Column(name = "book_author", length = 20)
	private String author;
	@Column(name = "book_price", length = 6)
	private long price;

}
