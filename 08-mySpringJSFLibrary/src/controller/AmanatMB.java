package controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.ProjectConfig;
import entity.Amanat;
import service.AmanatService;

import java.util.List;


@ManagedBean
@RequestScoped

public class AmanatMB
{
    Amanat amanat =new Amanat();
    
    ApplicationContext context = 
            new AnnotationConfigApplicationContext(ProjectConfig.class);
    
    AmanatService as=context.getBean(AmanatService.class);
    
   // AmanatService as=new AmanatServiceImpl();


    private String bookid;
    private String memberid;


    private String errmsg="";


    public String save()
    {
        try
        {
            as.AddNewAmanat(amanat, Integer.parseInt(bookid), Integer.parseInt(memberid));
            amanat = new Amanat();
            return "Amanats";
        }
        catch (Exception ex)
        {
            //FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,ex.getMessage(), null);
            //RequestContext.getCurrentInstance().showMessageInDialog(message);
            errmsg=ex.getMessage();
            return "";
        }
    }


    public List<Amanat> GetAllAmanat()
    {
        return as.GetAll();
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}
