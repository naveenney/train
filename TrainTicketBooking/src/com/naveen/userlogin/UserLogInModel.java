package com.naveen.userlogin;

import com.naveen.userview.UserView;

public class UserLogInModel {
	
	UserLogInView userLogInView;
	UserView userView;
	UserLogInModel(UserLogInView userLogInView)
	{
		userLogInView=this.userLogInView;
		userView=new UserView();
	}
	
	public void validateUser(String userName,String passWord)
	{
		if(userName.equals("nav123")&&passWord.equals("121"))
		{
			userLogInView.alertMse("LOGIN SUCCESSFULLY");
			userView.userView();
		}	
		else
		{
			System.out.println("WRONG CREDENTIALS TRY AGAIN");
			userLogInView.init();
		}
		
	}

}
