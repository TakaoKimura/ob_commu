package logic.error.count;

import logic.list.List;

public class CountableList extends List{

	private int addCount = 0;

	@Override
	public void add(Object o) {
		super.add(o);
		addCount++;
	}

	@Override
	public void addAll(Object[] objects) {
		super.addAll(objects);
		addCount += objects.length;
	}

	public int getAddCount(){
		return addCount;
	}
}
