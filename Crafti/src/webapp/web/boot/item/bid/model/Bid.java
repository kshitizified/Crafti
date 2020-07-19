package webapp.web.boot.item.bid.model;

public class Bid {

	private int bid_id;
	private int user_id;
	private int price;
	private String status;
	private String userName;
	

	public Bid(){}
	
	public Bid(int bid_id, int user_id, int price, String status,String userName) {
		super();
		this.bid_id = bid_id;
		this.user_id = user_id;
		this.price = price;
		this.status = status;
		this.userName = userName;
	}
	
	public int getBid_id() {
		return bid_id;
	}
	public void setBid_id(int bid_id) {
		this.bid_id = bid_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
