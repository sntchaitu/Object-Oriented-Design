package RCFAN;

import java.util.Scanner;

public class TestDriver {
	
	public static void main(String args[])
	{
		FanRemoteControl fanRemoteControl =  new FanRemoteControl();
		FanContext fc = new FanContext();
		FanOnCommand on = new FanOnCommand(fc);
		FanOffCommand off = new FanOffCommand(fc);
		FanIncreaseSpeedCommand incraseSpeed = new FanIncreaseSpeedCommand(fc);
		FanIncreaseTimerCommand increaseTimer = new FanIncreaseTimerCommand(fc);
		FanSwingOnCommand swingOn = new FanSwingOnCommand(fc);
		FanSwingOffCommand swingOff = new FanSwingOffCommand(fc);
		
		
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Fan Remote Controler Menu Options");
		System.out.println("1. Turn On");
		System.out.println("2. Turn Off");
		System.out.println("3. Increase Speed");
		System.out.println("4. Incrase Timer");
		System.out.println("5. Swing On");
		System.out.println("6. Swing Off");
		while(true)
		{
			int value = s1.nextInt();
			if(value==0)
			{
				System.out.println("Program Exited");
				break;
			}
			switch (value) {
			case 1:
				fanRemoteControl.setCommand(on);
				fanRemoteControl.buttonWasPressed();
				break;
			case 2:
				fanRemoteControl.setCommand(off);
				fanRemoteControl.buttonWasPressed();
				break;
			case 3:
				fanRemoteControl.setCommand(incraseSpeed);
				fanRemoteControl.buttonWasPressed();
				break;
			case 4:
				fanRemoteControl.setCommand(increaseTimer);
				fanRemoteControl.buttonWasPressed();
				break;
			case 5:
				fanRemoteControl.setCommand(swingOn);
				fanRemoteControl.buttonWasPressed();
				break;
			case 6:
				fanRemoteControl.setCommand(swingOff);
				fanRemoteControl.buttonWasPressed();
				break;
			default:
				break;
			}
		}
		s1.close();
		
	}
}
