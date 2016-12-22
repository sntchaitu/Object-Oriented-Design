package ParkingLot;

public class MotorCycle extends Vehicle {

	
	public MotorCycle()
	{
		spotsNeeded = 1;
		size = VehicleSize.Compact;
	}
	public boolean canFitInSpot(ParkingSpot Spot) {
		// TODO Auto-generated method stub
		if (Spot.getSize()==VehicleSize.Compact)
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
