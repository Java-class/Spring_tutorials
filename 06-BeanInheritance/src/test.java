import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{

	public static void main(String []args)
	{
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		/*Parent p=(Parent) ctx.getBean("parentid");
		System.out.println(p.toString());*/
		Child c=(Child) ctx.getBean("childid");
		c.setName("ChildName");
		System.out.println(c.toString());
		
	}
}
