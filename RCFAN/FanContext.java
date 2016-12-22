package RCFAN;



public class FanContext {
	
	
	public Fan fan;
	private FanState offState;
	private FanState onState;
	
	private FanState currentState;
	private FanState previousState;
	
	public FanContext()
	{
		 fan = new Fan();
		offState  = new FanOffState(this);
		onState  = new FanOnState(this);
		
		currentState = offState;
		setPreviousState(null);
	}
	public void setFanState(FanState newState){
		currentState = newState;
	}
	public FanState getFanState(){
		return currentState;
	}
	
	public FanState getOnstate(){
		return onState;
	}
	
	
	public FanState getOffstate(){
		return offState;
	}
	
	public void turnOff()
	{
		setPreviousState(this.getFanState());
		this.setFanState(getOffstate());
		currentState.turnOff(fan);
	}
	public void turnOn()
	{
		setPreviousState(this.getFanState());
		this.setFanState(getOnstate());
		currentState.turnOn(fan);
	}
	public void increaseSpeed()
	{
		currentState.increaseSpeed(fan);
	}
	public void increaseTimer()
	{
		currentState.increaseTimer(fan);
	}
	public void swingOn()
	{
		currentState.turnSwingOn(fan);
	}
	public void swingOff()
	{
		currentState.turnSwingOff(fan);
	}
	public FanState getPreviousState() {
		return previousState;
	}
	public void setPreviousState(FanState previousState) {
		this.previousState = previousState;
	}
}
