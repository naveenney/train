package com.naveen.login;

import com.naveen.adminlogin.AdminLogInView;
import com.naveen.userlogin.UserLogInView;

public class LogInModel {
	
	LogInView logInView;
	AdminLogInView adminLogInView;
	UserLogInView userLogInView;
	
	LogInModel(LogInView logInView)
	{
		logInView=this.logInView;
		adminLogInView=new AdminLogInView();
	}
	
	public void init(String str)
	{
		if(str.equals("admin"));
		{
			adminLogInView.init();
		}
		if(str.equals("user"))
		{
			userLogInView.init();
		}
	}

}
