package AnnotationStrategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import xmlstrategy.Member;
import xmlstrategy.MemberType;

@Configuration
//@ImportResource({"spring.xml"})
@ComponentScan(basePackages="xmlstrategy")
public class config
{

	
	/*@Bean
	public Member getMember()
	{
		return new Member();
	}*/
	
	/*@Bean(name="typeid")
	public MemberType getMemberType()
	{
		return new MemberType();
	}*/
	
	
}
