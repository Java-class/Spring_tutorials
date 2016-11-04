package lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class config
{
/*
	@Bean(initMethod="myInitmethod" , destroyMethod="myDestroymethod")
	public MemberService ms()
	{
		return new MemberService();
	}*/
}
