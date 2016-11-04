package controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.ProjectConfig;
import entity.*;
import service.MemberService;

import java.util.List;


@ManagedBean
@RequestScoped
public class MemberMB
{
    Member member =new Member();
    
    
    ApplicationContext context = 
            new AnnotationConfigApplicationContext(ProjectConfig.class);
    
    MemberService ms=context.getBean(MemberService.class);

    private String memtypeid;


    public String save() throws Exception
    {
        ms.Add(member,Integer.parseInt(memtypeid));
        member=new Member();
        return "Members";
    }

    public void delete(Member item)
    {
        ms.Remove(item);
    }

    public List<Member> getAllMembers()
    {
        return ms.GetAll();
    }
    public List<Membertype> getAllMembertypes()
    {
        return ms.GetAllMembertypes();
    }


    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }


    public String getMemtypeid() {
        return memtypeid;
    }

    public void setMemtypeid(String memtypeid) {
        this.memtypeid = memtypeid;
    }

}
