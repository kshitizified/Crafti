package webapp.web.boot.user.service.sql;

public interface UserSql {

	public final String getAllUser = "";
	
	public final String getUserbyContact = "SELECT contact, password, user_id, name FROM user WHERE user.contact=?";
	
	public final String saveUserBasic = "INSERT INTO user"
			+ "( name, type, password, contact) "
			+ " values (?,?,?,?)";
	
	
}
