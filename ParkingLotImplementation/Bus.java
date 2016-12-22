package ParkingLot;

public class Bus extends Vehicle {

	
	public Bus()
	{
		spotsNeeded = 5;
		size = VehicleSize.Large;
	}
	public boolean canFitInSpot(ParkingSpot Spot) {
		// TODO Auto-generated method stub
		if (Spot.getSize()==VehicleSize.Large)
		{
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}

}
