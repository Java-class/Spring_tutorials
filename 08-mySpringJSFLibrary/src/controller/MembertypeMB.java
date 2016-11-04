package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.context.RequestContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.ProjectConfig;
import entity.Membertype;
import service.MembertypeService;



@ManagedBean
@RequestScoped
public class MembertypeMB
{
	Membertype membertype =new Membertype();
    
	ApplicationContext context = 
            new AnnotationConfigApplicationContext(ProjectConfig.class);
	MembertypeService bs=context.getBean(MembertypeService.class);
    

	
    public Membertype getmembertype() {
		return membertype;
	}

	public void setmembertype(Membertype membertype) {
		this.membertype = membertype;
	}

    public String save()
    {
        try
        {
        	bs.Add(membertype);
            membertype = new Membertype();
            return "Membertypes";
        }
        catch (Exception ex)
        {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,ex.getMessage(), "");
            RequestContext.getCurrentInstance().showMessageInDialog(message);

            return "Membertypes";
        }
    }

    public void delete(Membertype item)
    {
        bs.Remove(item);
    }

    public List<Membertype> getAllmembertypes()
    {
        List<Membertype> x=bs.GetAll();
        return x;
    }
}
