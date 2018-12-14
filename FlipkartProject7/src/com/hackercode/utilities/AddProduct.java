package com.hackercode.utilities;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import com.hackercode.Constants.Constants;
import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionSupport;

public class AddProduct   extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String productName;
	private float price;
	private String description;
	private String image;
	public String addproduct() throws Exception{
		String rest=Constants.ERROR;
		Connection conn=null;
		try {
	         String URL = "jdbc:mysql://localhost/flipkartdemo";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = (Connection) DriverManager.getConnection(URL, "akash", "akash");
	         String sql = "INSERT INTO product_details values";
	         sql+="?,?,?,?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ps.setString(1, productName);
	         ps.setFloat(2, price);
	         ps.setString(3,description);
	         ps.setString(4, image);
	         int rs = ps.executeUpdate();
	         if(rs>0)
	            rest = Constants.SUCCESS;
	         
	      } catch (Exception e) {
	    	  rest = Constants.ERROR;
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
		return rest;

	}

}
