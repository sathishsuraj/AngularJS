package com.angular;

public class LoginDao {  
	  
	public static boolean validate(String username,String userpass){  
	 boolean status=false;  
	if(username.equalsIgnoreCase("admin")&& userpass.equalsIgnoreCase("admin"))
		status=true;
	 return status;  
	}  
	}  
