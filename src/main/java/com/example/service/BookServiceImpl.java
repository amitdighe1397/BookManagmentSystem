package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Books;
import com.example.repositry.BookRepositry;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepositry br;

	@Override
	public Books addBook(Books book) {

		Books bk = br.save(book);

		return bk;

	}

	@Override
	public void deleteBook(int id) {

		br.deleteById(id);

	}

	@Override
	public Books getBook(int id) {

		Books blist = br.findById(id).get();

		return blist;
	}

	@Override
	public List<Books> getAll() {

		List<Books> list = new ArrayList<>();
		
	      list =  br.findAll();
	
	
	return list;
		
	}

	@Override
	public Books update(Books book) {
		
		br.save(book);
		return book;
		
	}

}














