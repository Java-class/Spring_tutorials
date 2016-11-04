package inistrategy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args)
	{

			ApplicationContext ctx=new AnnotationConfigApplicationContext(config.class);
			//EagerBean eg=ctx.getBean(EagerBean.class);
			LazyBean bean=ctx.getBean(LazyBean.class);
			
		
	}

}
