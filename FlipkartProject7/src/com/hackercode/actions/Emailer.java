package com.hackercode.actions;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.hackercode.Constants.Constants;

import com.opensymphony.xwork2.ActionSupport;
import com.hackercode.databse.Pro;
public class Emailer extends ActionSupport  {
	/**
	 * 
	 */
	OtpClass sr=new OtpClass();
	Pro st=new Pro();
	private static final long serialVersionUID = 1L;
	private String from;
	private String password;
	private  String to;
	private  String subject;
	private  String body;
	private String abc;
    public String eotp;
    public  String email;
   
	

	

	static Properties properties=new Properties();
	static {
		 properties.put("mail.smtp.host", "smtp.gmail.com");
	        properties.put("mail.smtp.socketFactory.port", "465");
	        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	        properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.port", "465");
	        properties.setProperty("mail.smtp.ssl.enable", "true");
	        properties.setProperty("mail.smtp.ssl.trust", "*");
	        properties.setProperty("mail.smtp.sender.address", "aakaxh07@gmail.com");
	        properties.setProperty("mail.smtp.from", "aakaxh07@gmail.com");
		
		
	}
	public String execute() throws Exception {
		
		
		setAbc(sr.menu1());
		email=to;
		eotp=abc;
		System.out.println(email);
		System.out.println(eotp);
	    st.menu90(email,eotp);
		String ret=Constants.SUCCESS;
		this.from = "aakaxh07@gmail.com";
		try {
			
			Session session=Session.getDefaultInstance(properties,new javax.mail.Authenticator(){
				protected PasswordAuthentication 
	               getPasswordAuthentication() {
					return new
					PasswordAuthentication(from,password);
				}
			});
			Message message =new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
			message.setSubject(subject);
			message.setSubject(abc);
			message.setText(to);
			Transport.send(message);
		}catch(Exception e) {
			ret=Constants.ERROR;
			e.printStackTrace();
		}
		return ret;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public static Properties getProperties() {
		return properties;
	}
	public static void setProperties(Properties properties) {
		Emailer.properties = properties;
	}
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
  public String getEotp() {
			return eotp;
		}
	public void setEotp(String eotp) {
		    this.eotp = eotp;
		}
	public String getEmail() {
			return email;
		}
	public void setEmail(String email) {
			this.email = email;
		}
	
	

	
}
