package com.hsbc.filters;

import java.util.Comparator;

import com.hsbc.model.Book;

public class CompareBookByName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBookName().compareTo(o2.getBookName());
	}

}
