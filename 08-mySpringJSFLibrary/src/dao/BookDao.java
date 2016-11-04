package dao;
 import java.util.List;

import entity.Book;
public interface BookDao
{
	public Book Insert(Book t);
	public Book Update(Book t);
	public void Delete(Book t);
	public List<Book> SelectAll();
	public Book SelectById(int Id);
	//public Boolean isBookinAmanat(Book book);
	
}
