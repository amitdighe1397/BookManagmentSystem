package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Books;
import com.example.service.BookService;

@RestController
@RequestMapping("/home")
public class BookController {

	@Autowired
	BookService bs;

	@PostMapping("/save")
	Books addBook(@RequestBody Books book) {

		Books b = bs.addBook(book);
		return b;

	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable(value = "id") int id) {

		bs.deleteBook(id);
		return "Deleted id is" + id;

	}

	@GetMapping("/get/{bookid}")
	public Books getBook(@PathVariable(value = "bookid") int id) {

		Books b = bs.getBook(id);

		return b;
	}

	@GetMapping("/getall")
	public List<Books> getAll() {

		List<Books> b = bs.getAll();

		return b;

	}

	@PutMapping("/update")
	public Books update(@RequestBody Books book) {

		bs.update(book);
		return book;

	}

}
