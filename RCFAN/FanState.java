package RCFAN;

public interface FanState {

	public void turnSwingOn(Fan fan);
	public void turnSwingOff(Fan fan);
	public void increaseSpeed(Fan fan);
	public void increaseTimer(Fan fan);
	public void turnOn(Fan fan);
	public void turnOff(Fan fan);
	
	
}
