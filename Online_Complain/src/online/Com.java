package online;

import javax.validation.constraints.Size;

public class Com {
	
	@Size(min=2, max=30)
	private String name;
	@Size(min=10,message="should be 10 digit")
	private String mobile_no;
	
	@Size(min=10,max=140)
	private String complain;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getComplain() {
		return complain;
	}

	public void setComplain(String complain) {
		this.complain = complain;
	}

	
	
	
}
