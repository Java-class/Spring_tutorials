package scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan
public class config 
{

	@Bean(name="singletonscop")@Scope("singleton")
	public myMessage msg1()
	{
		return new myMessage();
	}
	
	
	@Bean(name="prototypescop") @Scope("prototype")
	public myMessage msg2()
	{
		return new myMessage();
	}
	
}
