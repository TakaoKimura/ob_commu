package selection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class EpsilonGreedySelector implements Selector {

	private final double epsilon;
	private final Random random = new Random();
	private final static long seed = 10;

	public EpsilonGreedySelector(double epsilon) {
		this.epsilon = epsilon;
		random.setSeed(seed);
	}

	@Override
	public Valuable select(Collection<? extends Valuable> valuables) {
		if (random.nextDouble() > epsilon)
			return greedySelect(valuables);
		else
			return randomSelect(valuables);
	}

	private Valuable greedySelect(Collection<? extends Valuable> valuables) {
		Iterator<?> iterator = valuables.iterator();
		if (!iterator.hasNext())
			return null;

		Valuable max = (Valuable) iterator.next();
		while (iterator.hasNext()) {
			Valuable nextValuable = (Valuable) iterator.next();
			if (max.getValue() < nextValuable.getValue()) {
				max = nextValuable;
			}
		}

		return max;

	}

	private Valuable randomSelect(Collection<? extends Valuable> valuables) {
		Iterator<?> iterator = valuables.iterator();
		int randomInt = random.nextInt(valuables.size());
		for (int i = 0; i < randomInt; i++)
			iterator.next();
		return (Valuable) iterator.next();
	}

}
