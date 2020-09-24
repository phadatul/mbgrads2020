package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Book;

public interface BookDAO {
	public List<Book> getAllBooks();

	public Book getBook(Book b);

	public void insertBook(Book b);

	public void deleteBook(Book b);

	public void updateBook(Book oldBook, Book updatedBook);

}
