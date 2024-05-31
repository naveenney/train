package com.naveen.adminlogin;

import com.naveen.adminview.AdminView;

public class AdminLogInModel {
	
	AdminLogInView adminLogInView;
	AdminView adminView;
	
	AdminLogInModel(AdminLogInView adminLogInView)
	{
		this.adminLogInView=adminLogInView;
		adminView=new AdminView();
	}
	
	public void validateAdmin(String userName,String passWord)
	{
		if(userName.equals("na123")&&passWord.equals("120"))
		{
			adminLogInView.alertMse("LOGIN SUCCESSFULLY");
			adminView.adminView();
		}	
		else
		{
			adminLogInView.alertMse("INVALID CREDENTIALS...TRY AGAIN");
			adminLogInView.init();
		}
		
	}


}
