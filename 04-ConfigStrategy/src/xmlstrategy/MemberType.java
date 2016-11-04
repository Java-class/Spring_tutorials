package xmlstrategy;

import org.springframework.stereotype.Component;

@Component
public class MemberType
{

	private String title;
	private String details;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
