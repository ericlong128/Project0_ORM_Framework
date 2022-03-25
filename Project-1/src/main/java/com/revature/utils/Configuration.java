package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Configuration {
	
	private String username;
	private String password;
	
	public Configuration(){
		username = "";
		password = "";
	}
	
	public Configuration(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public Connection connectToDataBase() {
		
		//Not to sure about this URL.
		String URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=projectone";
		String username = "postgres";
		String password = "postgres";
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(URL, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	}

}
