
public class Parent
{

	private String name;
	private String behavior;
	
	
	
	@Override
	public String toString() {
		return "Parent [name=" + name + ", behavior=" + behavior + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBehavior() {
		return behavior;
	}
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
	
}
