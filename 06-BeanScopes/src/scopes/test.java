package scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test 
{
	public static void main (String []args)
	{
		
		ApplicationContext ctx1=new AnnotationConfigApplicationContext(config.class);
		myMessage objA=(myMessage) ctx1.getBean("singletonscop");
		objA.setMsg("Msg set in ObjA");
		System.out.println(objA.toString());
		
		
		//ApplicationContext ctx2=new AnnotationConfigApplicationContext(config.class);
		myMessage objB=(myMessage) ctx1.getBean("singletonscop");
		//objB.setMsg("Msg set in ObjB");
		System.out.println(objB.toString());
		
		
		
		
	}
	
}
