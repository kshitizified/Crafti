package webapp.web.boot.item.service.sql;

public interface ItemSQL {

	
	public final String basicSaveItem = "INSERT INTO items "
			+ "(sold_by, item_name, description, price, quantity, type) "
			+ "VALUES "
			+ " (?,?,?,?,?,?)";
	
	public final String updateItem = "UPDATE items "
			+ "SET "
			+ "sold_to = ?, "
			+ "sold_at = ?, "
			+ "WHERE bid_id = ?";
	
	public final String saveBid = "INSERT INTO bidding "
			+ "(bid_id, user_id, price, status) "
			+ "VALUES "
			+ " (?,?,?,?)";
	
	public final String getItemByUser = "select "
			+ "items.bid_id, "
			+ "items.sold_by, "
			+ "items.item_name, "
			+ "items.description, "
			+ "items.price, "
			+ "items.quantity, "
			+ "items.type, "
			+ "user.name "
			+ "from "
			+ "items join user on user.user_id=items.sold_by "
			+ "where sold_by = ?";
	
	
	
}
