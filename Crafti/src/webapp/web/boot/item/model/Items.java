package webapp.web.boot.item.model;

public class Items {

	
	private int bidId;
	private int sold_by;
	private String name_item;
	private String description;
	private int price;
	private int quantity;
	private String type;
	private int sold_to;
	private int sold_at;
	private String soldByname;
	
	public Items(){
		this.bidId = -1;
		this.sold_by = -1;
		this.name_item = "";
		this.description = "";
		this.price = -1;
		this.quantity = -1;
		this.type = "";
		this.sold_at = -1;
		this.sold_to = -1;
		
		
		
	}
	
	public Items(int sold_by, String name_item, String description, int price, int quantity, String type) {
		super();
		this.sold_by = sold_by;
		this.name_item = name_item;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}




	public int getBidId() {
		return bidId;
	}
	public void setBidId(int bidId) {
		this.bidId = bidId;
	}
	public int getSold_by() {
		return sold_by;
	}
	public void setSold_by(int sold_by) {
		this.sold_by = sold_by;
	}
	public String getName_item() {
		return name_item;
	}
	public void setName_item(String name_item) {
		this.name_item = name_item;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSold_to() {
		return sold_to;
	}
	public void setSold_to(int sold_to) {
		this.sold_to = sold_to;
	}
	public int getSold_at() {
		return sold_at;
	}
	public void setSold_at(int sold_at) {
		this.sold_at = sold_at;
	}

	public String getSoldByname() {
		return soldByname;
	}

	public void setSoldByname(String soldByname) {
		this.soldByname = soldByname;
	}
	
	
	
	
	
	
}
