package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import entity.*;


//@Component
@Repository
public class AmanatDaoImpl implements AmanatDao {
  
	
	@PersistenceContext
    private EntityManager entityManager;
    
	// or do like this
    /*@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	*/
    
    
    
    
    /////////////////////////////////////
    public Amanat Insert(Amanat m)
    {
        entityManager.persist(m);
		entityManager.flush();
        return m;
    }
    
    public Amanat Update(Amanat m)
	{
	    return entityManager.merge(m);
	}
	
	public void Delete(Amanat m)
	{
	    m= entityManager.merge(m);
	    entityManager.remove(m);
	    
	}


	public Amanat SelectById(int id)
	{
	    return entityManager.find(Amanat.class,id);
	}
    
	@SuppressWarnings("unchecked")
	public List<Amanat> SelectAll()
	{
		Query query = entityManager.createQuery("FROM Amanat");
	    return (List<Amanat>) query.getResultList();
	}
	
}
