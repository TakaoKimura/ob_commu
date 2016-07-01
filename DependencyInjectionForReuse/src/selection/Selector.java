package selection;

import java.util.Collection;

public interface Selector {

	public Valuable select(Collection<? extends Valuable> valuables);
}

