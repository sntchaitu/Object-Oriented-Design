package ParkingLot;

public class ParkingSpot {
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;
	public ParkingSpot(VehicleSize spotSize, int row, int spotNumber, Level level) {
		super();
		this.spotSize = spotSize;
		this.row = row;
		this.spotNumber = spotNumber;
		this.level = level;
	}
	public Vehicle getVehicle()
	{
		return vehicle;
	}
	public boolean isAvailable()
	{
		return vehicle == null;
	}
	
	public boolean canFitVehicle(Vehicle vehicle)
	{
		return isAvailable() && vehicle.canFitInSpot(this);
	}
	
	public boolean park(Vehicle vehicle)
	{
		if(!canFitVehicle(vehicle))
		{
			return false;
		}
		else
		{
			this.vehicle  = vehicle;
			vehicle.parkInSpot(this);
			return true;
		}
	}
	public int  getRow()
	{
		return row;
	}
	public VehicleSize  getSize()
	{
		return spotSize;
	}
	public int  getNumber()
	{
		return spotNumber;
	}
	public void removeVehicle()
	{
		level.spotFreed();
		vehicle = null;
	}
	public void print()
	{
		if(vehicle==null)
		{
			if(this.spotSize==VehicleSize.Compact)
			{
				System.out.println("C");
			
			}
			if(this.spotSize==VehicleSize.Small)
			{
				System.out.println("S");
			
			}
			else
			{
				System.out.println("L");
			}
		}
		else
		{
			vehicle.print();
		}
	}
	
}
