package webapp.web.boot.item.bid.model;

public class Bid {

	private int bid_id;
	private int user_id;
	private int price;
	private String status;

	public Bid(){}
	
	public Bid(int bid_id, int user_id, int price, String status) {
		super();
		this.bid_id = bid_id;
		this.user_id = user_id;
		this.price = price;
		this.status = status;
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
}
