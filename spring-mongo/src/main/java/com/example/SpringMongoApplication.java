package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@SpringBootApplication
public class SpringMongoApplication {

	@Autowired
	private BookRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMongoApplication.class, args);
	}

	@PostMapping
	public Book getBooks(@RequestBody Book book) {
		return repository.save(book);
	}
	
	@GetMapping
	public List<Book> getBooks() {
		return repository.findAll();
	}
}
