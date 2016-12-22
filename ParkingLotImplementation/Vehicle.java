package ParkingLot;
import java.util.*;

import ParkingLot.VehicleSize;

public abstract class Vehicle {
	protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
	protected String LicencePlateNumber;
	protected int spotsNeeded;
	protected VehicleSize size;
	
//	Vehicle(String LicencePlateNumber,int spotsNeeded,VehicleSize size)
//	{
//		this.LicencePlateNumber = LicencePlateNumber;
//		this.spotsNeeded = spotsNeeded;
//		this.size = size;
//	}
	public int getSpotsNeeded()
	{
		return spotsNeeded;
	}
	public VehicleSize getSize()
	{
		return size;
	}
	public void parkInSpot(ParkingSpot s)
	{
		parkingSpots.add(s);
	}
	public void clearSpot()
	{
		for(int i=0;i<parkingSpots.size();i++)
			
		{
			if(parkingSpots.get(i).getVehicle().LicencePlateNumber.equalsIgnoreCase(this.LicencePlateNumber))
			{
				parkingSpots.get(i).removeVehicle();
			}
		}
		parkingSpots.clear();
	}
	public abstract boolean canFitInSpot(ParkingSpot Spot);
	public abstract void print();
}
