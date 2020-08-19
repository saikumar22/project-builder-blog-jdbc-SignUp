package dao;

import java.io.IOException;
import java.sql.SQLException;
import model.User;

interface UserDaoInterface{
	public int signUp(User user) throws ClassNotFoundException,SQLException,IOException, Exception;
	public boolean loginUser(User user) throws ClassNotFoundException,IOException,SQLException;
	
}