package RCFAN;

public class FanIncreaseSpeedCommand implements Command {
	FanContext fc;
	
	public FanIncreaseSpeedCommand(FanContext context)
	{
		fc = context;
	}
	public void execute() {
		// TODO Auto-generated method stub
		fc.increaseSpeed();
	}

}
