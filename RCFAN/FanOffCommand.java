package RCFAN;

public class FanOffCommand implements Command {
	FanContext fc;
	
	public FanOffCommand(FanContext context)
	{
		fc = context;
	}
	public void execute() {
		// TODO Auto-generated method stub
		fc.turnOff();
	}

}
