package service;

import java.util.List;

import entity.Book;

public interface BookService
{

	public Book Add(Book t) throws Exception;
	public void Remove(Book t);
	public Book Edit(Book t);
	
	public List<Book> GetAll();
}
