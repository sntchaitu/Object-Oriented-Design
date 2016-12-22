package ParkingLot;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class TestDriver {

	public static void main(String args[])
	{
		ParkingLot lot = new ParkingLot();
		
				
		Vehicle v = null;
				while(v==null|| lot.parkVehicle(v))
				{
					//lot.print();
					int r = ThreadLocalRandom.current().nextInt(0, 10);
					if(r<2)
					{
						v= new Bus();
					}
					else if(r<4)
					{
						v = new Car();
					}
					else
					{
						v = new MotorCycle();
					}
					System.out.println("parking a");
					v.print();
					System.out.println();
				}
				System.out.println("Parking Failed. Final state: ");
				//lot.print();
	}
}
