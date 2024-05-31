package com.naveen.booking;

import java.util.Scanner;

import com.naveen.model.Train;

public class BookingView {

	  BookingModel bm;
	  
	  public BookingView()
	  {
		  BookingModel bm=new BookingModel(this);
	  }
	
	  public void init()
	  {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("PLAN YOUR JOURNEY#");
		  
		  System.out.println("From Station:");
		  String fromStation=sc.next();
		  
		  System.out.println("To Station:");
		  String toStation=sc.next();
		  
		  
		  
		  
		  
	  }
	  
		
		public void alertMse(Train train)
		{
			System.out.println(train);
		}
}
