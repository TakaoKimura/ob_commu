package dependency;

import time.Timer;

public class Schedule {

	private String dateAndTime;
	private String event;
	private Timer timer = new Timer();

	public Schedule(String dateAndTime, String event){
		this.dateAndTime = dateAndTime;
		this.event = event;
	}

	public boolean isScheduledDateAndTime(){
		return dateAndTime.equals(timer.dateAndTime());
	}


	public String getEvent(){
		return event;
	}


}
