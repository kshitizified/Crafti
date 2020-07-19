package webapp.web.boot.user.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import webapp.web.boot.user.service.sql.UserSql;
import webapp.web.dbconnection.JDBCConnection;
import webapp.web.user.model.User;

@Service
public class UserService {


	Connection con = null; 
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public ArrayList<User> getAllUser(){
		return null;
	}
	
	public boolean isUser(User user) throws ClassNotFoundException, SQLException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(UserSql.getUserbyContact);                    
			ps.setInt(1, user.getContact());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				return false;
			}
			else {
				return true;
			}
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	public boolean saveUser(User user) throws ClassNotFoundException, SQLException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(UserSql.saveUserBasic);                    
			ps.setString(1, user.getName());
			ps.setString(2, user.getType());
			ps.setString(3, user.getPassword());
			ps.setInt(4, user.getContact());
			int r = ps.executeUpdate();		
			if(r==1) return true;
			else return false;
			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	public int checkUserCredentials(User user,HttpServletRequest request) throws ClassNotFoundException, SQLException{
		try {

//			request.getSession().setAttribute("userId",2);
//			request.getSession().setAttribute("userName","Jatin Sokhal");
//			
//			if(true) return 2;
			
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(UserSql.getUserbyContact);                    
			ps.setInt(1, user.getContact());	
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				return -1;
			}
			else {
				rs.next();
				request.getSession().setAttribute("userId",rs.getInt(3));
				request.getSession().setAttribute("userName",rs.getString(4));
				String password = rs.getString(2);
				int contact = rs.getInt(1);
				if(password.equals(user.getPassword())&&contact==user.getContact())
					return rs.getInt(3);
				else
					return -1;				
			}
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
	
	public User updateUser(User user) throws SQLException, ClassNotFoundException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(UserSql.updateUser);                    
			ps.setString(1, user.getName());
			ps.setString(2, user.getAddress());//.isEmpty()?"jdaskld":user.getAddress());
			ps.setInt(3,user.getContact());
			ps.setInt(4, user.getLandSize());
			ps.setString(5, user.getEmail());//.isEmpty()?"":user.getEmail());
			ps.setString(6, user.getCity());//.isEmpty()?"":user.getCity());
			ps.setString(7, user.getCountry());//.isEmpty()?"":user.getCountry());
			ps.setInt(8, user.getZipcode());
			ps.setInt(9, user.getUserId());
			
			int r = ps.executeUpdate();			
			if(r==1){
				return user;
			}
			else
				return null;
		}
		finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}	
	}
	
	
	public User getUser(int userId) throws SQLException, ClassNotFoundException{
		try {
			con = JDBCConnection.getConnection();
			ps = con.prepareStatement(UserSql.getUser);                    
			ps.setInt(1, userId);
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()){
				return null;
			}
			else{
				rs.next();
				User user = new User(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8));
				return user;
			}
		}
		finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}	
	}
}

