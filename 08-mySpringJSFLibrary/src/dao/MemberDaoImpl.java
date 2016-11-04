package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import entity.*;


//@Component
@Repository
public class MemberDaoImpl implements MemberDao 
{
    @PersistenceContext
    private EntityManager entityManager;
    
    
     // or do like this
    /*@PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	*/
    
    

    
    /////////////////////////////////////
    public Member Insert(Member m)
    {
        entityManager.persist(m);
		entityManager.flush();
        return m;
    }
    
    public Member Update(Member m)
	{
	    return entityManager.merge(m);
	}
	
	public void Delete(Member m)
	{
	    m= entityManager.merge(m);
	    entityManager.remove(m);
	    
	}


	public Member SelectById(int id)
	{
	    return entityManager.find(Member.class,id);
	}
    
	@SuppressWarnings("unchecked")
	public List<Member> SelectAll()
	{
		Query query = entityManager.createQuery("FROM Member");
	    return (List<Member>) query.getResultList();
	}
}
