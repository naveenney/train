package com.naveen.userview;

import java.util.Scanner;

import com.naveen.booking.BookingView;

public class UserView {
	
	BookingView bv;
	UserModel userModel;
	
	public UserView()
	{
		userModel=new UserModel(this);
	}
	
	public void userView()
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
	        
			System.out.println("Press 1 => Booking"+"\nExit");
			int option=sc.nextInt();
			
			switch(option)
			{
			case 1:
				bv.init();
				break;
			case 2:
				flag=false;
				break;
					
					
			}
			
			
		}
	}
			
		
	}


