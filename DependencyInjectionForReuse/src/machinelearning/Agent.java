package machinelearning;

import selection.Selector;

public class Agent {

	private Selector selector;

	public Agent(String name, State initialState, UpdateExpression expression, Selector selector) {
		this.name = name;
		this.initialState = initialState;
		this.state = initialState;
		this.expression = expression;
		this.selector = selector;
	}

	public void simulate(int step) {
		for (int i = 0; i < step; i++) {
			reset();
			while (!state.isTerminalState()) {
				expression.update(selectAction());
			}
		}
	}

	private Action selectAction() {
		Action selected = (Action) selector.select(state.getSelectableActions());
		move(selected);
		return selected;
	}

	private void move(Action selected){
		state = selected.getDestination();
	}

	private final String name;

	public void greet(){
		System.out.println("オッス、オラ"+name+"! ワクワクすっぞ！");
	}

	private final State initialState;
	private State state;
	private UpdateExpression expression;


	private void reset() {
		state = initialState;
	}

	public State getState() {
		return state;
	}



}


