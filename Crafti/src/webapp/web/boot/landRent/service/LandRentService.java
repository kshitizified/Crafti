package webapp.web.boot.landRent.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;
import webapp.web.boot.landRent.model.LandRent;
import webapp.web.boot.landRent.service.sql.LandRentSQL;
import webapp.web.dbconnection.JDBCConnection;

@Service
public class LandRentService {

	Connection con = null; 
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public boolean save(LandRent rent) throws ClassNotFoundException, SQLException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(LandRentSQL.save);                    
			ps.setInt(1, rent.getOwner_id());
			ps.setInt(2, rent.getRenter_id());
			ps.setInt(3, rent.getPrice());
			ps.setInt(4,rent.getLandSize());
			
			int r = ps.executeUpdate();	
			if(r==1) return true;
			else return false;
			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
}
