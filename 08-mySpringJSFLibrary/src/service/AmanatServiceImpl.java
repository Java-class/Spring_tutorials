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
public class AmanatServiceImpl implements AmanatService {
    @Autowired
	private AmanatDao amanatDao;
    @Autowired
   	private BookDao bookDao;
    @Autowired
   	private MemberDao memberDao;
    
   //@Autowired 
//   public void setMemberDao(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }
    
   
    
    
    
  
    public Amanat AddNewAmanat(Amanat amanat, int bookID, int memberID) throws Exception
    {
        //em.getTransaction().begin();

     //  try {


            //Add Amanat Business Logic
            Book book = bookDao.SelectById(bookID);
            Member member = memberDao.SelectById(memberID);

            //Logic 0: is Book in Amanat
//           if (bookDao.isBookinAmanat(book))
//                throw new Exception("کتاب موجود نمی باشد و امانت است");
////
////            // Logic 1: Book should not be reference
//            if (book.getIsreference())
//                throw new Exception("کتاب مرجع می باشد و قابل امانت نیست");
////
////            // Logic 2: Member should not have penalty
//            if (member.getAllpenalty()>0)
//                throw new Exception("عضو جریمه دارد و نمی تواند کتاب امانت بگیرد");



            amanat.setBook(book);
            amanat.setMember(member);
            //amanat.setDate2(currentDate + member.getMembertype().getMaxdays());
            //amanat.setDate1(currentDate);

            amanatDao.Insert(amanat);

            //em.getTransaction().commit();
      //  }
        //catch (Exception ex)
        //{
//        	/amanatDao.entityManager.getTransaction().rollback();
          //  throw new Exception(ex.getMessage());
        //}


        return null;
    }

    public void Remove(Amanat t)
	{
        //em.getTransaction().begin();

        // Remove any Book Business Logic should be HERE

		amanatDao.Delete(t);
        //em.getTransaction().commit();
    }

	public Amanat Edit(Amanat t)
	{
       // em.getTransaction().begin();

        // Edit Book Business Logic/Rule should be HERE
		
		Amanat m=amanatDao.Update(t);
       // em.getTransaction().commit();
        return m;
	}

	public List<Amanat> GetAll()
	{
		return amanatDao.SelectAll();
	}

    

}
