package com.example.service;

import java.util.List;


import com.example.entity.Books;

public interface BookService {

	Books addBook(Books book);

	void deleteBook(int id);

	Books getBook(int id);

	List<Books> getAll();

	Books update(Books book);

}
