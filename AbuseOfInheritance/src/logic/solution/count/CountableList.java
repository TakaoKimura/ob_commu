package logic.solution.count;

import logic.list.List;

public class CountableList{

	private int addCount = 0;
	private List list = new List();

	public void add(Object o) {
		list.add(o);
		addCount++;
	}

	public void addAll(Object[] objects) {
		list.addAll(objects);
		addCount += objects.length;
	}

	public int getAddCount(){
		return addCount;
	}
}
