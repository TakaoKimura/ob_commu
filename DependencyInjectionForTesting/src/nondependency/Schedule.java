package nondependency;


public class Schedule {

	private String dateAndTime;
	private String event;
	private TimeManager timeManager;

	public Schedule(String dateAndTime, String event, TimeManager timeManager){
		this.dateAndTime = dateAndTime;
		this.event = event;
		this.timeManager = timeManager;
	}

	public boolean isScheduledDateAndTime(){
		return dateAndTime.equals(timeManager.dateAndTime());
	}


	public String getEvent(){
		return event;
	}


}
