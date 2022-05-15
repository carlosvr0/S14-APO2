package model;

import java.util.Calendar;

import controller.ClockController;
import javafx.application.Platform;

public class LocalTime extends Thread{
	
	private ClockController clockController;
	private static String localTime;
	
	public LocalTime(ClockController clockController) {
		this.clockController = clockController;
		
	}
	
	@Override
	public void run() {
		while(true) {
			localTime = clockController.timeFormat.format(clockController.calendar.getInstance().getTime());
			
			Platform.runLater( () -> {clockController.localTimeLabel.setText(localTime);} );
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
