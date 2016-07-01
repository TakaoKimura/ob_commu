package nondependency;

import time.Timer;

public class GenericTimeManager implements TimeManager {

	private Timer timer = new Timer();

	@Override
	public String dateAndTime() {
		return timer.dateAndTime();
	}


}

