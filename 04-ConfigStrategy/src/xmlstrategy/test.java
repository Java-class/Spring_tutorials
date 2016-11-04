package xmlstrategy;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import AnnotationStrategy.*;
public class test {

	public static void main(String[] args) {

		//Member m=new Member();
		
		/*@SuppressWarnings("deprecation")
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		Member m=(Member) factory.getBean("memberid");*/
		
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext ctx=new AnnotationConfigApplicationContext(config.class);
		
		Member m= (Member) ctx.getBean(Member.class);
		MemberType type=(MemberType) ctx.getBean(MemberType.class);
		
		type.setTitle("Lecturer");
	
		m.setName("Mostafa");
		m.setFamily("Anbarmoo");
		m.setType(type);
		
		
		System.out.println(m.toString());
	}

}
