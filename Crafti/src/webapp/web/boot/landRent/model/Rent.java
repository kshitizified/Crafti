package webapp.web.boot.landRent.model;

public class Rent {

	private int owner_id;
	private int renter_id;
	private int price;
	private String date;
	private String name;
	private String description;
	
	public int getOwner_id() {
		return owner_id;
	}




	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}




	public int getRenter_id() {
		return renter_id;
	}




	public void setRenter_id(int renter_id) {
		this.renter_id = renter_id;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}
	
	public Rent(){}
	public Rent(int owner_id, int price, String date, String name, String description) {
		super();
		this.owner_id = owner_id;
		this.price = price;
		this.date = date;
		this.name = name;
		this.description = description;
	}



	public Rent(int owner_id, int renter_id, int price, String date, String name, String description) {
		super();
		this.owner_id = owner_id;
		this.renter_id = renter_id;
		this.price = price;
		this.date = date;
		this.name = name;
		this.description = description;
	}
	
	
	
	
	

}
