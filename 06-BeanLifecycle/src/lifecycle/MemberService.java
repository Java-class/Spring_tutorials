package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService  implements InitializingBean , DisposableBean
{

	private Member member;
	

	@Override
	public String toString() {
		return "MemberService [member=" + member.getName() + "]";
	}

	@Autowired
	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public void destroy() throws Exception 
	{

		System.out.println("destroyMethod is called by DisposableBean ");
	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("InitMethod is called by InitializingBean  ");
		this.member.setName("Name is set by @InitializingBean");
		
	}
	
	/*@PostConstruct
	public void InitMethod()
	{
		System.out.println("InitMethod is called by @PostConstruct ");
		this.member.setName("Name is set by @PostConstruct");
	}
	
	@PreDestroy
	public void destroyMethod()
	{
		System.out.println("DestroyMethod is called by @PreDestroy ");
	}*/
	
	
	
	/*public void myInitmethod()
	{
		System.out.println("myInitMethod is called ");
		this.member.setName("Name is set myInitMethod");
	}
	
	
	
	public void myDestroymethod()
	{
		System.out.println("myDestroymethod is called ");
	}*/
	
}
