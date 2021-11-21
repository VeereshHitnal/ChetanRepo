package com.crm.SDET25.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteQuery {
	@Test
	public void SampleJDBCExecuteQuery() throws SQLException
	{
		//step 1: Register database - we need to create a object of driver
		Driver DriverRef = new Driver();
		DriverManager.registerDriver(DriverRef);
		
		//step 2: get connection with database-provide data base name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb", "root", "root");
		
		//step 3: issue create statement
		 Statement stat = con.createStatement();
		 
		//step 4 : execute a query - provide table name
		 ResultSet result = stat.executeQuery("select * from sinfo;");
		 
		 while(result.next())
		 {
			 System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		 }
		 
		 //step 5: close the database
		 
		 con.close();
	}
	
}
