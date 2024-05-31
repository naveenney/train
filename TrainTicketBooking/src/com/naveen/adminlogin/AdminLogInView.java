package com.naveen.adminlogin;

import java.util.Scanner;

public class AdminLogInView {
	
  AdminLogInModel adminLogInModel;
	
	public AdminLogInView()
	{
		adminLogInModel=new AdminLogInModel(this);
	}
	
	public void init()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Username:");
		String userName=sc.next();
		System.out.println("Enter your password:");
		String password=sc.next();
		
		adminLogInModel.validateAdmin(userName, password);
		
	}
	
	public void alertMse(String mse)
	{
		System.out.println(mse);
	}
	

}
