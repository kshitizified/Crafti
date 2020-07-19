package webapp.web.boot.item.bid.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import webapp.web.boot.item.bid.model.Bid;
import webapp.web.boot.item.bid.service.sql.BidSQL;
import webapp.web.boot.item.model.Items;
import webapp.web.boot.item.service.sql.ItemSQL;
import webapp.web.dbconnection.JDBCConnection;

@Service
public class BidService {

	Connection con = null; 
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public boolean save(Bid bid) throws ClassNotFoundException, SQLException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(BidSQL.save);                    
			ps.setInt(1, bid.getBid_id());
			ps.setInt(2, bid.getUser_id());
			ps.setInt(3, bid.getPrice());
			ps.setString(4,bid.getStatus());
			
			int r = ps.executeUpdate();	
			if(r==1) return true;
			else return false;
			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	public boolean updateStatus(Bid bid) throws ClassNotFoundException, SQLException{
		try {
			System.out.println("update sold by and sold at");
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(BidSQL.updateStatus);                    
			ps.setString(1, bid.getStatus());
			ps.setInt(2, bid.getBid_id());
			ps.setInt(3, bid.getUser_id());
			
			int r = ps.executeUpdate();	
			if(r==1) return true;
			else return false;
			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	public ArrayList<Bid> getAllBids(int bidId) throws ClassNotFoundException, SQLException{
		ArrayList<Bid> bids = new ArrayList<Bid>();
		
		try {
			
			System.out.println("gettinf all bids with given userId");
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(BidSQL.getAllBids);                    
			ps.setInt(1, bidId);
			rs = ps.executeQuery();	
			if(!rs.isBeforeFirst())
				return null;
			else{
				while(rs.next()){
					bids.add(new Bid(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4)));
				}
				return bids;
			}
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
}
