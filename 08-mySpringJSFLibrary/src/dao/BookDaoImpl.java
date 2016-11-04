package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import entity.Book;

@Repository
public class BookDaoImpl implements BookDao {

	
	@PersistenceContext
	private EntityManager em;
	
	
	public Book Insert(Book t) {
		em.persist(t);
		em.flush();
		return t;
	}

	public Book Update(Book m)
	{
	    return em.merge(m);
	}
	
	public void Delete(Book m)
	{
	    m= em.merge(m);
	    em.remove(m);
	    
	}


	public Book SelectById(int id)
	{
	    return em.find(Book.class,id);
	}
    
	@SuppressWarnings("unchecked")
	public List<Book> SelectAll()
	{
		Query query = em.createQuery("FROM Book");
	    return (List<Book>) query.getResultList();
	}
	
	/* public Boolean isBookinAmanat(Book book)
	    {
	        Query query = entityManager.createQuery("SELECT COUNT(a) FROM Amanat a where a.book.id=:bid and a.date3 is null");
	        query.setParameter("bid",book.getId());
	        if (Integer.parseInt(query.getSingleResult().toString())>0)
	            return true;
	        else
	            return  false;
	    }*/
	

}
