package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.BookDao;
import entity.Book;

@Service
@Transactional
public class BookServiceImpl  implements BookService
{
	
	@Autowired
	private BookDao bookdao;
	
	
	@Override
	public Book Add(Book t) throws Exception {
		
		/// cheek All semantic or business rules
		bookdao.Insert(t);
		return t;
	}

	@Override
	public void Remove(Book t)
	{
		bookdao.Delete(t);	
	}

	@Override
	public Book Edit(Book t) {
		
		bookdao.Update(t);
		return t;
	}

	@Override
	public List<Book> GetAll() {
		return bookdao.SelectAll();
	}

	
	
}
