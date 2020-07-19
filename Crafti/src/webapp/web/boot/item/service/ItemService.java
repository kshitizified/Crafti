package webapp.web.boot.item.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import webapp.web.boot.item.bid.service.sql.BidSQL;
import webapp.web.boot.item.model.Items;
import webapp.web.boot.item.service.sql.ItemSQL;
import webapp.web.boot.user.service.sql.UserSql;
import webapp.web.dbconnection.JDBCConnection;


@Service
public class ItemService {
	
	Connection con = null; 
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public boolean save(Items item) throws ClassNotFoundException, SQLException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(ItemSQL.basicSaveItem);                    
			ps.setInt(1, item.getSold_by());
			ps.setString(2, item.getName_item());
			ps.setString(3, item.getDescription());
			ps.setInt(4, item.getPrice());
			ps.setInt(5,item.getQuantity());
			ps.setString(6, item.getType());
			
			int r = ps.executeUpdate();	
			if(r==1) return true;
			else return false;
			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	public boolean update(Items item) throws ClassNotFoundException, SQLException{
		try {
			System.out.println("update sold by and sold at");
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(ItemSQL.updateItem);                    
			ps.setInt(1, item.getSold_to());
			ps.setInt(2, item.getSold_at());
			ps.setInt(3, item.getBidId());
			
			int r = ps.executeUpdate();	
			if(r==1) return true;
			else return false;
			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	
	
	
	public ArrayList<Items> getItemByUser(int userId) throws ClassNotFoundException, SQLException{
		try {
			System.out.println("get items by user id");
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(ItemSQL.getItemByUser);                    
			ps.setInt(1, userId);
			rs = ps.executeQuery();
			
			if(!rs.isBeforeFirst()) {
				return null;
			}
			else {
				ArrayList<Items> items = new ArrayList<Items>();
				while(rs.next()){
					Items item  = new Items();
					
					item.setBidId(rs.getInt(1));
					item.setSold_by(rs.getInt(2));
					item.setName_item(rs.getString(3));
					item.setDescription(rs.getString(4));
					item.setPrice(rs.getInt(5));
					item.setQuantity(rs.getInt(6));
					item.setType(rs.getString(7));
					item.setSoldByname(rs.getString(8));
					items.add(item);
				}
				return items;
			}
			
		
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}		
	public Items getItemById(int bidId) throws ClassNotFoundException, SQLException{
		Items item = new Items();
		try {
			System.out.println("get paritcular items details");
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(ItemSQL.getItemByUser);                    
			ps.setInt(1, bidId);
			rs = ps.executeQuery();
			
			if(!rs.isBeforeFirst()) {
				return null;
			}
			else {
				rs.next();
					item.setBidId(rs.getInt(1));
					item.setSold_by(rs.getInt(2));
					item.setName_item(rs.getString(3));
					item.setDescription(rs.getString(4));
					item.setPrice(rs.getInt(5));
					item.setQuantity(rs.getInt(6));
					item.setType(rs.getString(7));
					item.setSoldByname(rs.getString(8));
				}
				return item;
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
			
}
