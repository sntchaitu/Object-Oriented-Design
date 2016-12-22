package RCFAN;

public class FanOffState implements FanState {

	FanContext fs = null;
	FanOffState(FanContext fs)
	{
		this.fs = fs;
	}
	@Override
	public void turnSwingOn(Fan fan) {
		
		System.out.println("Fan turned off. Pleas turn on.");
	}

	@Override
	public void turnSwingOff(Fan fan) {
		System.out.println("Fan turned off. Pleas turn on.");
	}

	@Override
	public void increaseSpeed(Fan fan) {
		System.out.println("Fan turned off. Pleas turn on.");
	}

	@Override
	public void increaseTimer(Fan fan) {
		System.out.println("Fan turned off. Pleas turn on.");
	}

	@Override
	public void turnOn(Fan fan) {
		// TODO Auto-generated method stub
		System.out.println("Fan turned off. Pleas turn on.");
	}

	@Override
	public void turnOff(Fan fan) {
		// TODO Auto-generated method stub
		if(fs.getPreviousState()!=fs.getFanState())
		{
			System.out.println("Fan  turned Off.");
			fan.setSpeed(0);
			fan.setOn(0);
			
		}
		
		
	}

	

}
