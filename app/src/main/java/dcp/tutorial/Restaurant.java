package dcp.tutorial;

public class Restaurant {
	private String name="";
	private String address="";
	private String type="";
	private String date="";
	
	public String getName() {
		return(name);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return(address);
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getType() {
		return(type);
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public String toString() {
		return(getName());
	}

	public String getDate() { return(date);}

	public void setDate(String date){ this.date=date;}
}