package RCFAN;

public class FanOnCommand implements Command {
	FanContext fc;
	
	public FanOnCommand(FanContext context)
	{
		fc = context;
	}
	public void execute() {
		// TODO Auto-generated method stub
		fc.turnOn();
	}

}
