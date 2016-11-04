package xmlstrategy;

import org.springframework.stereotype.Component;

@Component
public class Member {

	private String name;
	private String family;
	private MemberType type;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", family=" + family + ", type=" + type.getTitle() + "]";
	}
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
	public MemberType getType() {
		return type;
	}
	public void setType(MemberType type) {
		this.type = type;
	}
	
	
}
