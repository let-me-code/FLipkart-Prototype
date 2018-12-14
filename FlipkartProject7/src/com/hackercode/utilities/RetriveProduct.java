package com.hackercode.utilities;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.hackercode.Constants.Constants;
import com.mysql.jdbc.Connection;
import com.opensymphony.xwork2.ActionSupport;
public class RetriveProduct extends ActionSupport {
	private static final long serialVersionUID = 1L;
    private ArrayList<Product> ProductList=new ArrayList<Product>();
    public ArrayList<Product> getProductList(){
    	return ProductList;
    }
    public void setProductList(ArrayList<Product> ProductList) {
    	this.ProductList=ProductList;
    }
	private String productName;
	private float price;
	private String description;
	private String image;
	public String retrieveProduct() throws Exception{
		String rest=Constants.ERROR;
		Connection conn=null;
		try {
	         String URL = "jdbc:mysql://localhost/flipkartdemo";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = (Connection) DriverManager.getConnection(URL, "akash", "akash");
	         String sql = "SELECT * FROM product_detail";
	         sql+="?,?,?,?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	           ResultSet rs=ps.executeQuery();
	           while(rs.next()) {
	        	   Product p=new Product();
	        	   p.setProductName(rs.getString(1));
	        	   p.setDescription(rs.getString(2));
	        	   p.setPrice(rs.getFloat(3));
	        	   p.setImage(rs.getString(4));
	        	   
	        	 ProductList.add(p);
	        	   rest=Constants.SUCCESS;
	        	   
	           }
	         
	        
	         
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
