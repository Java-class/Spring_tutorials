package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public class BookDaoImpl  implements BookDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void insert(Book b) {
		em.persist(b);
		
	}

}
