package trainroutes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naveen.model.Train;

public class TrainRoutesView {
	
	TrainRoutesModel trainRoutesModel;
	List <String> trainRoutes;
	
	public TrainRoutesView()
	{
		trainRoutesModel=new TrainRoutesModel(this);
		trainRoutes=new ArrayList<>();
	}
	public void createTrains()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Train Number:");
		int trainNumber=sc.nextInt();
		
		System.out.println("Enter the Train Name:");
		String trainName=sc.next();
		
		System.out.println("Enter the train Departure Time:");
		String departureTime=sc.next();
		
		System.out.println("Enter the train Arrival Time:");
		String arrivalTime=sc.next();
		
		while(true)
		{
			System.out.println("Enter the trainRoutes:");
			String trainRoute=sc.next();
			trainRoutes.add(trainRoute);

			System.out.println("DO TO ADD TRAIN ROUTES?");
		    byte checker=sc.nextByte();
		    
		    if(checker==1)
		    {
		    	break;
		    }
			
		}
		System.out.println("Enter the total seats:");
		short totalSeats=sc.nextShort();
		
		System.out.println("Enter the Price:");
		short price=sc.nextShort();
		
		
		trainRoutesModel.addTrains(trainNumber,trainName,departureTime,arrivalTime,trainRoutes,totalSeats,price);
		
		
	}

}
