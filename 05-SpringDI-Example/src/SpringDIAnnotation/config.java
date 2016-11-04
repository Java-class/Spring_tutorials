package SpringDIAnnotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class config 
{
	
	/*@Bean
	public Member member()
	{
		return new Member();
	}*/
	
	
	
	
	@Bean
	public MemberType type1()
	{
		MemberType mt=new MemberType();
		mt.setTitle("Lecturere");
		return mt;
	}
	
	@Bean
	public MemberType type2()
	{
		MemberType mt=new MemberType();
		mt.setTitle("Student");
		return mt;
	}
	
	
	
	/*@Bean
	public String string ()
	{
		 return "mostafa";
	}*/
	
	/*@Bean
	public MemberType type()
	{	
		return new MemberType();
	}
		*/
	
}


