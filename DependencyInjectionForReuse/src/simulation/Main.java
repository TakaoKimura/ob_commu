package simulation;

import machinelearning.Action;
import machinelearning.Agent;
import machinelearning.State;
import machinelearning.UpdateExpression;
import selection.EpsilonGreedySelector;
import selection.Selector;

class Main {

	private Main() {

	}

	public static void main(String[] args) {

		UpdateExpression expression = new UpdateExpression(0.1, 0.9);
		Selector selector = new EpsilonGreedySelector(0.1);
		Agent smith = new Agent("Smith", generateInitialState(), expression, selector);
		smith.simulate(300);

	}

	private static State generateInitialState() {
		State start = State.initialState(0.);
		State forest = State.ordinaryState(0.);
		State lake = State.ordinaryState(0.);
		State tresure = State.terminalState(10.);
		State bandit = State.terminalState(-10.);

		start.addSelectableAction(new Action(0., forest));
		start.addSelectableAction(new Action(0., lake));
		forest.addSelectableAction(new Action(0., tresure));
		forest.addSelectableAction(new Action(0., start));
		lake.addSelectableAction(new Action(0., start));
		lake.addSelectableAction(new Action(0., bandit));
		tresure.addSelectableAction(new Action(0., start));
		bandit.addSelectableAction(new Action(0., start));
		return start;
	}

}
