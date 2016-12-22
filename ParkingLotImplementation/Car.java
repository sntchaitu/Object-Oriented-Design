package ParkingLot;

public class Car extends Vehicle {

	
	public Car()
	{
		spotsNeeded = 1;
		size = VehicleSize.Small;
	}
	public boolean canFitInSpot(ParkingSpot Spot) {
		// TODO Auto-generated method stub
		if (Spot.getSize()==VehicleSize.Small)
		{
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}

}
