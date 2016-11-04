package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.BookDao;
import model.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService 
{
	
	@Autowired
	private BookDao bookDao;
	
	public void add(Book b)
	{
		bookDao.insert(b);
	}
	
}
