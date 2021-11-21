package com.crm.SDET25.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// script to close the connection if there is a exception using try and catch block and finally block. 
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class sampleJDBCExceptionHandling {
	@Test
	
	public void SampleJDBCExecuteUpdate() throws SQLException
	{
		Connection con = null;
		try {
		//step 1: register the database
		Driver DriverRef = new Driver();
		DriverManager.registerDriver(DriverRef);
		
		//step 2: get connection with data base-provide data base name
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb", "root", "root");
		
		//step 3: issue create statement
		Statement stat = con.createStatement();
				
		//step 4: update a query bt using executeUpdate() method
		int result = stat.executeUpdate("insert into sinfo ues ('netaji',16,'Gada');");
		
		if(result==1)
		{
			System.out.println("data created");
		}
		else {
			System.out.println("data creation failed");		
		}
		}
		catch(Exception e)
		{
			
		}
		finally {
		
		//step 5: close the data base
		con.close();
		System.out.println("connection is closed");	
		}
	}

}
