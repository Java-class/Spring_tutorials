package SpringDIAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Member
{
	private String name;
	private String family;
	
	//@Autowired   ///field injection strategy
	private MemberType type;
	
	//// Constructor injection will be inject here
	/*@Autowired
	public Member(MemberType type) 
	{
		this.type=type;
	}*/

	/// setter injection 	
	
	
	@Autowired @Qualifier("type2")
	//@Required
	public void setType(MemberType type) {
		this.type = type;
	}
	
	public Member(){}
	
	
	@Override
	public String toString() {
		return "Member [ name=" + name + ", family=" + family + ", "+ "type=" + type.getTitle()+"]"; //
	}

	
	
	
	public String getName() {
		return name;
	}

	
	//@Autowired is'nt work for primitive data type!!!!!
	//@Required
	@Value("Mostafa")
	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
	
}
