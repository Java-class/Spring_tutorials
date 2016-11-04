package lifecycle;

import org.springframework.stereotype.Component;

@Component
public class Member 
{

	private String name;
	private String family;
	
	public String getName() {
		return name;
	}
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
