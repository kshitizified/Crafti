package webapp.web.boot.item.bid.service.sql;

public interface BidSQL {

	
	public final String save = "INSERT INTO bidding "
			+ "(bid_id, user_id, price, status) "
			+ "VALUES "
			+ " (?,?,?,?)";
	
	public final String updateStatus = "UPDATE bidding "
			+ "SET "
			+ "status = ?, "
			+ "WHERE bid_id=? AND user_id = ?";	
	
	public final String getAllBids = "select bidding.bid_id, bidding.user_id, bidding.price, bidding.status, user.name"
			+ " from bidding join user on "
			+ "user.user_id = bidding.user_id "
			+ "where bidding.bid_id = ?";
	
	public final String getAllBidsFixed = ""
			+ " select items.bid_id, "
			+ " items.sold_by, items.item_name, "
			+ "	items.description, "
			+ " items.price, items.quantity,"
			+ " items.type, "
			+ " user.name"
			+ " from items join user on "
			+ "user.user_id = items.sold_by "
			+ "where items.type = 'fixed'";
	
	public final String getAllBidsFlexible = ""
			+ " select items.bid_id, "
			+ " items.sold_by, items.item_name, "
			+ "	items.description, "
			+ " items.price, items.quantity,"
			+ " items.type, "
			+ " user.name"
			+ " from items join user on "
			+ "user.user_id = items.sold_by "
			+ "where items.type = 'bidding'";	
	
	
	
}
