package com.org.gen.day11HandsOn;

import java.sql.Connection;
import java.sql.DriverManager;

public class getConnection {

	public static Connection connection() {
		// TODO Auto-generated method stub
		Connection con=null;
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	System.out.println("Driver is loading...");
        	
        	//step2
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","pavan1816");
            System.out.println("Connecting to DB...");
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
        return con;
	}
}
