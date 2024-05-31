package com.naveen.adminview;

import java.util.Scanner;

import trainroutes.TrainRoutesView;

public class AdminView {
	
	AdminModel adminModel;
	TrainRoutesView trainRoutesView;
	
	public AdminView()
	{
		adminModel=new AdminModel(this);
		trainRoutesView=new TrainRoutesView();
	}
	
	public void adminView()
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("Press 1 => add Trains");
			byte option=sc.nextByte();
			
			switch(option)
			{
			case 1:
			   trainRoutesView.createTrains();
			   break;
			case 2:
			{
				flag=false;
				break;
			}
					
			
	      	}
		
	}
	

}
}
