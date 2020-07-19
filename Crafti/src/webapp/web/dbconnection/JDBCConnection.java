package webapp.web.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException{
//		ResourceBundle rb = ResourceBundle.getBundle("config");
//		Class.forName(rb.getString("drivername"));
//		System.out.println(rb.getString("dburl"));
//		Connection con = DriverManager.getConnection(rb.getString("dburl"),rb.getString("userid"),"developer@am");//rb.getString("password"));
//		System.out.println(con.getCatalog());
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmer_db","root","root");//rb.getString("password"));
//		
		
		return con;
	}

	public static void closeConnection(ResultSet rs, PreparedStatement ps, Connection con) throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(ps != null) {
			ps.close();
		}
		if(con != null) {
			con.close();
		}	
	}

}