package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.Book;

public class BookDAOImpl implements BookDAO {

	ArrayList<Book> bookList;

	public BookDAOImpl() {
		bookList = new ArrayList<Book>();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public Book getBook(Book b) {
		Book book = bookList.get(bookList.indexOf(b));
		return book;
	}

	@Override
	public void insertBook(Book b) {
		bookList.add(b);

	}

	@Override
	public void deleteBook(Book b) {
		bookList.remove(b);

	}

	@Override
	public void updateBook(Book oldBook, Book updatedBook) {
		bookList.add(bookList.indexOf(oldBook), updatedBook);

	}

}
