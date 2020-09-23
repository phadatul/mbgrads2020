package com.hsbc.filters;

import java.util.Comparator;

import com.hsbc.model.Book;

public class CompareBookByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getPrice() > o2.getPrice())
			return 1;
		else if (o1.getPrice() < o2.getPrice())
			return -1;
		else
			return 0;
	}

}
