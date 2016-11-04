import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class configA 
{

	
	@Bean
	public Member member()
	{
		Member m=new Member();
		m.setName("Name From configA");
		m.setFamily("Family From configA");
		return m;
		
	}
	
}
