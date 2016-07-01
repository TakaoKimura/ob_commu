package machinelearning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class State {

	private final double reward;
	private final Set<Action> selectableActions = new HashSet<Action>();
	private final Mode mode;

	private enum Mode {
		initial, ordinary, terminal;
	}

	private State(double reward, Mode mode) {
		this.mode = mode;
		this.reward = reward;
	}

	public static State terminalState(double reward) {
		return new State(reward, Mode.terminal);
	}

	public static State ordinaryState(double reward) {
		return new State(reward, Mode.ordinary);
	}

	public static State initialState(double reward) {
		return new State(reward, Mode.initial);
	}

	public double getReward() {
		return reward;
	}

	public boolean addSelectableAction(Action action) {
		return selectableActions.add(action);
	}

	public boolean isInitialState() {
		return mode == Mode.initial;
	}

	public boolean isTerminalState() {
		return mode == Mode.terminal;
	}

	public Set<Action> getSelectableActions() {
		return selectableActions;
	}

	public Action maxQualityAction() {

		Iterator<Action> iterator = selectableActions.iterator();
		if (!iterator.hasNext())
			return null;

		Action max = (Action) iterator.next();
		while (iterator.hasNext()) {
			Action nextAction = (Action) iterator.next();
			if (max.getValue() < nextAction.getValue()) {
				max = nextAction;
			}
		}
		return max;
	}

}
