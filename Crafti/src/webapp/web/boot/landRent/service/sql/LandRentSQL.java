package webapp.web.boot.landRent.service.sql;

public interface LandRentSQL {

	public final String  save = "INSERT INTO rent "
			+ "(owner_id, price, date, name, description) "
			+ "values (?,?,now(),?,?)";
	
	
	public final String  getAll = "SELECT  "
			+ "owner_id, price, date, name, description "
			+ " from rent join user on rent.owner_id = user.user_id";
}
