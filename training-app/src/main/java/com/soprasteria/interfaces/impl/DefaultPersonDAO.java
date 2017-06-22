package com.soprasteria.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.log4j.Logger;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.soprasteria.interfaces.PersonDAO;
import com.soprasteria.models.PersonModel;

public class DefaultPersonDAO implements PersonDAO{
	
	final static Logger logger = Logger.getLogger(DefaultPersonDAO.class);
	final static String USER_INFO = "SELECT name,surname,email FROM person where email = ?;"; 

	public PersonModel getPersonInfo(String email) {
		
		PersonModel personModel = new PersonModel();
				
		MysqlDataSource dataSource = new MysqlDataSource(); //TODO spring bean
		
			dataSource.setUser("root");
			dataSource.setUrl("jdbc:mysql://localhost:3306/Training");
			
			Connection conn = null;
			
			try {
				
				conn = dataSource.getConnection();
			
				PreparedStatement stmtUserInfo = conn.prepareStatement(USER_INFO);
				stmtUserInfo.setString(1, email);
				
				ResultSet rsUserInfoSet = stmtUserInfo.executeQuery();
							
				if(rsUserInfoSet.first()){
					personModel.setName(rsUserInfoSet.getString("name"));
					personModel.setSurname(rsUserInfoSet.getString("surname"));
					personModel.setEmail(rsUserInfoSet.getString("email"));
				}
				
			}
			
			catch(SQLException e) {
				logger.error(e);			
			}
			finally{
			    DbUtils.closeQuietly(conn); //oppure try with resource
			}
				
		return personModel;
	}

	public void updatePersonInfo(String email) {
		// TODO Auto-generated method stub	
	}

	public void insertUser(PersonModel personModel) {
		// TODO Auto-generated method stub
		
	}

}
