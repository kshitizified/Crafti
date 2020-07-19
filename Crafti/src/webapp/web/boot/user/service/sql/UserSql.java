package webapp.web.boot.user.service.sql;

public interface UserSql {

	public final String getAllUser = "";
	
	public final String getUserbyContact = "SELECT contact, password, user_id, name FROM user WHERE user.contact=?";
	
	public final String saveUserBasic = "INSERT INTO user"
			+ "( name, type, password, contact) "
			+ " values (?,?,?,?)";
	
	public final String updateUser = "UPDATE user "
			+ "set name = ?, address = ?, contact = ?, land_size = ?, email = ?, city = ?, country = ?, zipcode = ? "
			+ "where user_id = ?";
	
	public final String getUser = "SELECT "
			+ "name, address, contact, land_size, country, city, zipcode, email"
			+ " FROM user WHERE user_id=?";	
	
	
	
}
