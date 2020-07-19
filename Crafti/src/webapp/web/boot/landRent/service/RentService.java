package webapp.web.boot.landRent.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;
import webapp.web.boot.landRent.model.Rent;
import webapp.web.boot.landRent.service.sql.LandRentSQL;
import webapp.web.dbconnection.JDBCConnection;

@Service
public class RentService {

	Connection con = null; 
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public boolean save(Rent rent) throws ClassNotFoundException, SQLException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(LandRentSQL.save);                    
			ps.setInt(1, rent.getOwner_id());
			ps.setInt(2, rent.getPrice());
			ps.setString(3,rent.getName());
			ps.setString(4, rent.getDescription());
			
			int r = ps.executeUpdate();	
			if(r==1) return true;
			else return false;
			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	
	public boolean getAll(Rent rent) throws ClassNotFoundException, SQLException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(LandRentSQL.save);                    
			ps.setInt(1, rent.getOwner_id());
			ps.setInt(2, rent.getPrice());
			ps.setString(3,rent.getName());
			ps.setString(4, rent.getDescription());
			
			int r = ps.executeUpdate();	
			if(r==1) return true;
			else return false;
			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	
}
