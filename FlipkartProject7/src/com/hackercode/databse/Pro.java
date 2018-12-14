package com.hackercode.databse;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pro {


public void menu90(String email, String eotp) throws SQLException {
	
	PreparedStatement stmt = null;
    java.sql.Connection conn = null;
   
    System.out.println("%%%%%%%%%%%%%%%%BEFORE TRY BLOCK");
    try {	
    	
    	System.out.println("******************");	
    	System.out.println("email****** "+ eotp);
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/flipkartprojectdemo","root","kvuc");	
		stmt=conn.prepareStatement("Insert into flipkartprojo values(?,?)");
		stmt.setString(1, email);
		stmt.setString(2, eotp);
		int rt=stmt.executeUpdate();
		if(rt>0){
			System.out.println("Record inserted");
		}
		
	}catch(SQLException ae) {
    	System.out.println(ae.toString());
    }catch(ClassNotFoundException a) {
    	System.out.println(a.toString());
    }
  
    
	System.out.println(email);
	System.out.println(eotp);
}
	


}
