package SpringDIAnnotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		
		ApplicationContext context = 
		            new AnnotationConfigApplicationContext(config.class);
		//context.register(config.class);
		//context.refresh();
		
		Member member=context.getBean(Member.class);
		//MemberType mt=context.getBean(MemberType.class); //// a required variable should be inject with IoC container
		 
		//Member member=new Member();
		//member.setName("Mostafa");
		member.setFamily("Anbarmoo");
		//mt.setTitle("Lecturer");
		
		/*MemberType mt=new MemberType();
		mt.setTitle("Lecturer");*/
		 
		//member.setType(mt);
		
		System.out.println(member.toString());
	
	}

}
