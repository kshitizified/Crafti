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
	
	public final String getAllBids = "select bid_id, user_id, price, status"
			+ " from bidding where bid_id = ?";
	
}
