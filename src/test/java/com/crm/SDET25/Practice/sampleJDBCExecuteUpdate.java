package com.crm.SDET25.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class sampleJDBCExecuteUpdate {
	@Test
	
	public void SampleJDBCExecuteUpdate() throws SQLException
	{
		//step 1: register the database
		Driver DriverRef = new Driver();
		DriverManager.registerDriver(DriverRef);
		
		//step 2: get connection with data base-provide data base name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb", "root", "root");
		
		//step 3: issue create statement
		Statement stat = con.createStatement();
				
		//step 4: update a query bt using executeUpdate() method
		int result = stat.executeUpdate("insert into sinfo values ('netaji',16,'Gada');");
		
		if(result==1)
		{
			System.out.println("data created");
		}
		else {
			System.out.println("data creation failed");		
		}
		
		//step 5: close the data base
		con.close();
	}

}
