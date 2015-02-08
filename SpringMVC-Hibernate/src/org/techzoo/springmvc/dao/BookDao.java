package org.techzoo.springmvc.dao;

import java.util.List;

import org.techzoo.springmvc.form.Book;

public interface BookDao {
	
	public void addBook(Book book);
	public void updateBook(Book book);
	public List<Book> listBooks();
	public Book getBookById(Integer bookId);
	public void removeBook(Integer id);
	
}
