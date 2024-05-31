package com.naveen.model;

import java.util.List;

public class Train {
	
	int trainNumber;
	String trainName;
	String departureTime;
	String arrivalTime;
    List<String> trainRoutes;
    short totalSeats;
    short price;
    
    public Train()
    {
    	
    }
    
	public Train(int trainNumber, String trainName, String departureTime, String arrivalTime, List<String> trainRoutes,
			short totalSeats, short price) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.trainRoutes = trainRoutes;
		this.totalSeats = totalSeats;
		this.price = price;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public List<String> getTrainRoutes() {
		return trainRoutes;
	}
	public void setTrainRoutes(List<String> trainRoutes) {
		this.trainRoutes = trainRoutes;
	}
	public short getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(short totalSeats) {
		this.totalSeats = totalSeats;
	}
	public short getPrice() {
		return price;
	}
	public void setPrice(short price) {
		this.price = price;
	}
    
    public String toString()
    {
		return trainNumber+" "+trainName+" "+departureTime+" "+arrivalTime+" "+totalSeats+" "+price;
    	
    }
    

}
