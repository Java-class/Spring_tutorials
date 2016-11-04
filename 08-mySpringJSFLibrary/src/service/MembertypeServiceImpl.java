package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.*;
import entity.Membertype;


//@Component
@Service
@Transactional
public class MembertypeServiceImpl implements MembertypeService {
    @Autowired
	private MembertypeDao membertypeDao;
    
   //@Autowired 
//   public void setMemberDao(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }
    
   
    
    
    
  
    public Membertype Add(Membertype m)
    {
        //em.getTransaction().begin();


        // Add New Book Business Logic should be HERE

        //m.setAllpenalty(0);
       // m.setTasviyedate(null);
        //m.setMembertype(membertypeDao.SelectById(memtypeid));

        m=membertypeDao.Insert(m);

        //em.getTransaction().commit();
        return m;
    }

    public void Remove(Membertype t)
	{
        //em.getTransaction().begin();

        // Remove any Book Business Logic should be HERE

		membertypeDao.Delete(t);
        //em.getTransaction().commit();
    }

	public Membertype Edit(Membertype t)
	{
       // em.getTransaction().begin();

        // Edit Book Business Logic should be HERE
		
		Membertype m=membertypeDao.Update(t);
       // em.getTransaction().commit();
        return m;
	}

	public List<Membertype> GetAll()
	{
		return membertypeDao.SelectAll();
	}

    
    
    

}
