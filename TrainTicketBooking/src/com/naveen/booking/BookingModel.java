package com.naveen.booking;

import java.util.List;

import com.naveen.datalayer.DataLayer;
import com.naveen.model.Train;

public class BookingModel {
	
	BookingView bv;
	List <Train> trains;
	
	BookingModel(BookingView bv)
	{
		bv=new BookingView();
		trains=DataLayer.getInstance().getTrains();
	}
	
	public void showAvailableTrains(String fs,String ts)
	{
		   int i=0;
		   while(!trains.isEmpty())
		   {
			   if(trains.contains(fs))
			   {
			    bv.alertMse(trains.get(i));
			   }
			   i++;
			   
		   }
           
	}	
		
	
		
	

}
