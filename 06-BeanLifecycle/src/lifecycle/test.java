package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {

			AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(config.class);
			MemberService ms=ctx.getBean(MemberService.class);
			System.out.println(ms.toString());
			
			System.out.println("context is initialized");
			ctx.close();
			System.out.println("context is closed");
	}

}
