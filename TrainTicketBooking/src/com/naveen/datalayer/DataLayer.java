package com.naveen.datalayer;

import java.util.ArrayList;
import java.util.List;

import com.naveen.model.Train;

public class DataLayer {
	
	private static DataLayer dataLayer;
	private List <Train> trains;
	private List <>
	
	DataLayer()
	{
	    trains=new ArrayList<>();
	}
	
	public static DataLayer getInstance()
	{
		if(dataLayer==null)
		{
			dataLayer=new DataLayer();
		}
		return dataLayer;
	}
	
	public void addTrains(Train train)
	{
	  trains.add((train));		
	}
	
	public List<Train> getTrains()
	{
		return trains;
	}
	

}
