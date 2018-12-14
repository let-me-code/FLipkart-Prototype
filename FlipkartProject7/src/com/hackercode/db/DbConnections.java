
	package com.hackercode.db;

	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import com.hackercode.Constants.Constants;
	import com.mysql.jdbc.Connection;
	import com.opensymphony.xwork2.ActionSupport;

	public class DbConnections extends ActionSupport {
		
		private static final long serialVersionUID = 1L;
		private String name;
		private String user;
		private String password;

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String login() throws Exception{
			String rest=Constants.ERROR;
			Connection conn=null;
			try {
		         String URL = "jdbc:mysql://localhost/flipkart";
		         Class.forName("com.mysql.jdbc.Driver");
		         conn = (Connection) DriverManager.getConnection(URL, "root", "rootroot");
		         String sql = "SELECT name FROM login WHERE";
		         sql+=" user = ? AND password = ?";
		         PreparedStatement ps = conn.prepareStatement(sql);
		         ps.setString(1, user);
		         ps.setString(2, password);
		         ResultSet rs = ps.executeQuery();

		         while (rs.next()) {
		            name = rs.getString(1);
		            rest = Constants.SUCCESS;
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



