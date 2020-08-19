package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;

import utility.ConnectionManager;

public  class UserDAO implements UserDaoInterface{
	   String sign="insert into USERS VALUES (?,?)";
	   String login="select * from USERS where EMAIL=? and PASSWORD=?";	
	   
	   public int signUp(User user) throws Exception {
			Connection con=null;
		   con=ConnectionManager.getConnection();
		   PreparedStatement prep=con.prepareStatement(sign);
		   prep.setString(1, user.getEmail());
		   prep.setString(2,user.getPassword());
		   int execution =prep.executeUpdate();
		   return execution;		   
	   }
	   
	   public boolean loginUser(User user) {
		   Connection con=null;
		   try {
			con=ConnectionManager.getConnection();
			 PreparedStatement prep=con.prepareStatement(login);
			   prep.setString(1,user.getEmail());
			   prep.setString(2, user.getPassword());
			   
			   ResultSet rs=prep.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		   return false;   
	   }

}