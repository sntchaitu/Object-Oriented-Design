package RCFAN;

public class Fan {

	public final static  int  MAX_TIMER_LIMIT = 30;
	public final static  int  MAX_SPEED_LIMIT = 3;
	public final static   int TIMER_STEP_VALUE = 5; 
	public final static   int SPEED_STEP_VALUE = 1; 
	private  int timerValue = 0;
	private  int speed = 0;
	private  int oscillate = 0;
	private  int on = 0;
	
	public int getOscillate() {
		return oscillate;
	}
	public void setOscillate(int oscillate) {
		this.oscillate = oscillate;
	}
	public int getOn() {
		return on;
	}
	public void setOn(int on) {
		this.on = on;
	}
	public  int getTimerValue() {
		return timerValue;
	}
	public  void setTimerValue(int timerValue) {
		this.timerValue = timerValue;
	}
	public  int getSpeed() {
		return speed;
	}
	public  void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
