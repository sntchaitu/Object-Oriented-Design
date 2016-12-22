package RCFAN;

public class FanSwingOnCommand implements Command {
	FanContext fc;
	
	public FanSwingOnCommand(FanContext context)
	{
		fc = context;
	}
	public void execute() {
		// TODO Auto-generated method stub
		fc.swingOn();
	}

}
