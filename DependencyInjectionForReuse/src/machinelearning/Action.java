package machinelearning;

import selection.Valuable;

public class Action implements Valuable{

	private double quality;
	private final State destination;

	public Action(double quality, State destination) {
		this.quality = quality;
		this.destination = destination;
	}

	@Override
	public void setValue(double value) {
		quality = value;

	}

	@Override
	public double getValue() {
		return quality;
	}

	State getDestination() {
		return destination;
	}

}
