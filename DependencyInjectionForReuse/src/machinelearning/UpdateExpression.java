package machinelearning;


public class UpdateExpression{

	private final double learningRate;
	private final double discount;

	public UpdateExpression(double learningRate, double discount) {
		this.learningRate = learningRate;
		this.discount = discount;
	}

	void update(Action action) {
		State nextState = action.getDestination();
		double nextMaxQuality = nextState.maxQualityAction().getValue();
		double updated = action.getValue() + learningRate
				* (nextState.getReward() + discount * nextMaxQuality - action.getValue());
		action.setValue(updated);
	}

}
