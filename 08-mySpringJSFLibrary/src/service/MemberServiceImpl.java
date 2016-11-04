package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.*;
import entity.*;


//@Component
@Service
@Transactional
public class MemberServiceImpl implements MemberService {
    
	
	@Autowired
	private MemberDao memberDao;
    @Autowired
   	private MembertypeDao membertypeDao;
    
   //@Autowired 
//   public void setMemberDao(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }
    
   
    
    
    
    
    //// define here
    public Member Add(Member t)
	{
        //em.getTransaction().begin();

        // Add New Book Business Logic should be HERE

        Member m=memberDao.Insert(t);

        //em.getTransaction().commit();
		return m;
    }

    public Member Add(Member m,int memtypeid)
    {
        //em.getTransaction().begin();


        // Add New Book Business Logic/Rule should be HERE

        m.setAllpenalty(0);
        m.setTasviyedate(null);
        m.setMembertype(membertypeDao.SelectById(memtypeid));

        m=memberDao.Insert(m);

        //em.getTransaction().commit();
        return m;
    }

    public void Remove(Member t)
	{
        //em.getTransaction().begin();

        // Remove any Book Business Logic should be HERE

		memberDao.Delete(t);
        //em.getTransaction().commit();
    }

	public Member Edit(Member t)
	{
       // em.getTransaction().begin();

        // Edit Book Business Logic should be HERE
		
		Member m=memberDao.Update(t);
       // em.getTransaction().commit();
        return m;
	}

	public List<Member> GetAll()
	{
		return memberDao.SelectAll();
	}

    public List<Membertype> GetAllMembertypes()
    {
        return membertypeDao.SelectAll();
    }
    
    

}
