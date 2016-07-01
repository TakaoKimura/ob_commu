package logic.list;

public class List {
	private Object[] objects = new Object[100];
	private int size = 0;

	public void add(Object o){
		objects[size] = o;
		size++;
	}

	public void addAll(Object[] objects){
		for(Object o: objects){
			add(o);
		}
	}
}

