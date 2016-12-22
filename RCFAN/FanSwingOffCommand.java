package RCFAN;

public class FanSwingOffCommand implements Command {
	FanContext fc;
	
	public FanSwingOffCommand(FanContext context)
	{
		fc = context;
	}
	public void execute() {
		// TODO Auto-generated method stub
		fc.swingOff();
	}

}
