package com.naveen.login;

import java.util.Scanner;

public class LogInView {
	LogInModel logInModel;
	
	public LogInView()
	{
		logInModel=new LogInModel(this);
	}
	
	public void init()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ADMIN/USER");
		String str=sc.next();
		str.toLowerCase();
		logInModel.init(str);
	}
	

}
