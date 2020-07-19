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
	
	
	
}

