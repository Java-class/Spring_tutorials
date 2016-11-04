import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class configB 
{

	
	@Bean
	public Member member()
	{
		Member m=new Member();
		m.setName("Name From configB");
		return m;
		
	}
	
}
