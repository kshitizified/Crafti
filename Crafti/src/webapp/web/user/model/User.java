package webapp.web.user.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String name;
	private int userId;
	private String address;
	private int contact;
	private int landSize;
	private String password;
	private String type;
	private int landRent;
	private int landTook;
	private String country;
	private String city;
	private int zipcode;
	private String email;
	
	public User(){}
	
	public User(int contact, String password) {
		super();
		this.contact = contact;
		this.password = password;
	}

	
	
	public User(String name, String address, int contact, int landSize, String country, String city, int zipcode,
			String email) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.landSize = landSize;
		this.country = country;
		this.city = city;
		this.zipcode = zipcode;
		this.email = email;
	}

	public User(String name, int contact, String password, String type) {
		super();
		this.name = name;
		this.contact = contact;
		this.password = password;
		this.type = type;
	}
	public User(String name, int userId, String address, int contact, int landSize, String password, String type,
			int landRent, int landTook) {
		super();
		this.name = name;
		this.userId = userId;
		this.address = address;
		this.contact = contact;
		this.landSize = landSize;
		this.password = password;
		this.type = type;
		this.landRent = landRent;
		this.landTook = landTook;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getLandSize() {
		return landSize;
	}
	public void setLandSize(int landSize) {
		this.landSize = landSize;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLandRent() {
		return landRent;
	}
	public void setLandRent(int landRent) {
		this.landRent = landRent;
	}
	public int getLandTook() {
		return landTook;
	}
	public void setLandTook(int landTook) {
		this.landTook = landTook;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
