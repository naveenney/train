package trainroutes;

import java.util.List;

import com.naveen.datalayer.DataLayer;
import com.naveen.model.Train;

public class TrainRoutesModel {
	
	TrainRoutesView trainRoutesView;
	Train train;
	
	
	TrainRoutesModel(TrainRoutesView trainRoutesView)
	{
		trainRoutesView=this.trainRoutesView;
		train=new Train();
	}

	
	public void addTrains(int trainNumber,String trainName,String departureTime,String arrivalTime,List<String> trainRoutes,short totalSeats,short price)
	{
	     train.setTrainNumber(trainNumber);
	     train.setTrainName(trainName);
	     train.setDepartureTime(departureTime);
	     train.setArrivalTime(arrivalTime);
	     train.setTrainRoutes(trainRoutes);
	     train.setTotalSeats(totalSeats);
	     train.setPrice(price);
	     
	     DataLayer.getInstance().addTrains(train);
	}

}
