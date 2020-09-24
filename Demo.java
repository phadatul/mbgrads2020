package com.hsbc.Main;

import java.util.HashSet;
import java.util.Set;

import com.hsbc.dao.BookDAOImpl;
import com.hsbc.model.Book;

public class Demo {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Dan Brown");
		set1.add("Cathy Sierra");
		Set<String> set2 = new HashSet<String>();
		set2.add("HI");
		set2.add("CBYE");

		Book b1 = new Book(1, "abc", set1, 450);
		Book b2 = new Book(2, "mno", set2, 499);
		Book b3 = new Book(6, "asd", set1, 199);
		Book b4 = new Book(22, "www", set2, 999);

		BookDAOImpl db = new BookDAOImpl();
		db.insertBook(b1);
		db.insertBook(b2);
		db.insertBook(b3);
		db.insertBook(b4);

		System.out.println(db.getAllBooks());

		db.deleteBook(new Book(1, "abc", set1, 450));
		db.deleteBook(new Book(6, "asd", set1, 199));
		System.out.println(db.getAllBooks());

		//db.updateBook(b1, new Book(1, "abcD", set2, 600));

		//System.out.println(db.getAllBooks());
	}

}
