package com.naveen.userlogin;

import java.util.Scanner;

public class UserLogInView {
	
	UserLogInModel userLogInModel;
	
	UserLogInView()
	{
		userLogInModel=new UserLogInModel(this);
	}
	
	public void init()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Username:");
		String userName=sc.next();
		System.out.println("Enter your password:");
		String password=sc.next();
		userLogInModel.validateUser(userName, password);
		
	}
	
	public void alertMse(String mse)
	{
		System.out.println(mse);
	}
	

}
