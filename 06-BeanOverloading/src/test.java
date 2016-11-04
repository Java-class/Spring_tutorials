import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(configA.class,configB.class);
		Member m=ctx.getBean(Member.class);
		System.out.println(m.toString());
		
	}

}
