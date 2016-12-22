package RCFAN;

public class FanOnState implements FanState {

	FanContext fs = null;
	FanOnState(FanContext fs)
	{
		this.fs = fs;
	}
	@Override
	public void turnSwingOn(Fan fan) {
		// TODO Auto-generated method stub
		if(fan.getOscillate()==0)
		{
			System.out.println("Fan swing turned On.");
			fan.setOscillate(1);
		}
		
	}

	@Override
	public void turnSwingOff(Fan fan) {
		// TODO Auto-generated method stub
		if(fan.getOscillate()==1)
		{
			System.out.println("Fan swing turned Off.");
			fan.setOscillate(0);
		}
	}

	@Override
	public void increaseSpeed(Fan fan) {
		// TODO Auto-generated method stub
		
		if(fan.getSpeed()+Fan.SPEED_STEP_VALUE>Fan.MAX_SPEED_LIMIT)
		{
			//fs.setPreviousState(fs.getFanState());
			//fs.setFanState(fs.getOffstate());
			fs.turnOff();
			
		}
		else
		{
			int temp = fan.getSpeed()+Fan.SPEED_STEP_VALUE;
			fan.setSpeed(temp);
			System.out.println("Fan Speed increased by 1 current speed is"+fan.getSpeed());
		}
	}

	@Override
	public void increaseTimer(Fan fan) {
		// TODO Auto-generated method stub
		if(fan.getTimerValue()+Fan.TIMER_STEP_VALUE<Fan.MAX_TIMER_LIMIT)
		{
			fan.setTimerValue(fan.getTimerValue()+Fan.TIMER_STEP_VALUE);
			System.out.println("Fan timer incrase by 5");
		}
		else
		{
			System.out.println("Timervalue cannot be exceed "+Fan.MAX_TIMER_LIMIT);
		}
	}

	@Override
	public void turnOn(Fan fan) {
		// TODO Auto-generated method stub
		if(fs.getPreviousState()!=fs.getFanState())
		{
			fan.setSpeed(1);
			System.out.println("Fan  turned On.");
			fan.setOn(1);
			
		}
		
	}

	@Override
	public void turnOff(Fan fan) {
//		// TODO Auto-generated method stub
//		System.out.println("Fan  turned Off.");
//		fan.setSpeed(0);
//		fan.setOn(0);
	}

	

}
