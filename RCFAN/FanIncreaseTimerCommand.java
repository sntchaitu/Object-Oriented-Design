package RCFAN;

public class FanIncreaseTimerCommand implements Command {
	FanContext fc;
	
	public FanIncreaseTimerCommand(FanContext context)
	{
		fc = context;
	}
	public void execute() {
		// TODO Auto-generated method stub
		fc.increaseTimer();
	}

}
