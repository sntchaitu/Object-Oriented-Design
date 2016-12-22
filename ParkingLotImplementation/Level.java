package ParkingLot;

public class Level {

	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots =0;
	private static final int SPOTS_PER_ROW = 10;
	
	public Level(int flr, int numberSpots)
	{
		floor = flr;
		spots = new ParkingSpot[numberSpots];
		int largeSpots = numberSpots/4;
		int smallSpots = numberSpots/4;
		int compactSpots = numberSpots -largeSpots+smallSpots;
		
		for(int i=0;i<numberSpots;i++)
		{
			VehicleSize sz = VehicleSize.Compact;
			if(i<largeSpots)
			{
				sz = VehicleSize.Large;
			}
			else if(i<largeSpots+smallSpots)
			{
				sz = VehicleSize.Small;
			}
			int row = i/SPOTS_PER_ROW;
			spots[i] = new ParkingSpot(sz, row, i, this);
		}
		availableSpots = numberSpots;	
	}
	public int availableSpots()
	{
		return availableSpots;
	}
	public boolean parkVehicle(Vehicle vehicle)
	{
		if(availableSpots<vehicle.spotsNeeded)
		{
			return false;
		}
		int spotNumber = findAvailableSpot(vehicle);
		if(spotNumber==-1)
		{
			return false;
		}
		return parkVehicleStartingAt(spotNumber,vehicle);
		
	}
	
	public boolean parkVehicleStartingAt(int spotNumber,Vehicle vehicle)
	{
		vehicle.clearSpot();
		boolean result = true;
		for(int i=spotNumber;i<spotNumber+vehicle.spotsNeeded;i++)
		{
			result &= spots[i].park(vehicle);
		}
		return result;
		
	}
	
	public int findAvailableSpot(Vehicle vehicle)
	{
		int spotsNeeded = vehicle.getSpotsNeeded();
		int lastRow = -1;
		int spotsFound = 0;
		for(int i=0;i<spots.length;i++)
		{
			ParkingSpot spot = spots[i];
			if(lastRow!= spot.getRow())
			{
				lastRow = spot.getRow();
				spotsFound = 0;
				
			}
			if(spot.canFitVehicle(vehicle))
			{
				spotsFound++;
			}
			else
			{
				spotsFound=0;
			}
			if(spotsFound==vehicle.spotsNeeded)
			{
				return i-(spotsNeeded-1);
			}
		}
		
		return -1;
		
	}
	
	public void print()
	{
		int lastRow = -1;
		for (int i = 0; i < spots.length; i++) {
			ParkingSpot spot = spots[i];
			if (spot.getRow() != lastRow) {
				System.out.print("  ");
				lastRow = spot.getRow();
			}
			spot.print();
		}
	}
	
	public void spotFreed()
	{
		availableSpots++;
	}
}
