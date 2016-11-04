package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;

import entity.*;


//@Component
@Repository
public class MembertypeDaoImpl implements MembertypeDao {
    
	
	@PersistenceContext
    private EntityManager entityManager;
    
     // or do like this
    /*@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	*/
    
    
    
    
    /////////////////////////////////////
    public Membertype Insert(Membertype m)
    {
        entityManager.persist(m);
		entityManager.flush();
        return m;
    }
    
    public Membertype Update(Membertype m)
	{
	    return entityManager.merge(m);
	}
	
	public void Delete(Membertype m)
	{
	    m= entityManager.merge(m);
	    entityManager.remove(m);
	    
	}


	public Membertype SelectById(int id)
	{
	    return entityManager.find(Membertype.class,id);
	}
    
	@SuppressWarnings("unchecked")
	public List<Membertype> SelectAll()
	{
		Query query = entityManager.createQuery("FROM Membertype");
	    return (List<Membertype>) query.getResultList();
	}
	
    
    
    
}
