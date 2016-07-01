package dependency;

public class SortingList {
	int[] list = new int[100];
	int size = 0;
	Sorter sorter;

	public SortingList(Sorter sorter){
			this.sorter = sorter;
	}

	void ascendingSort() {
		list = sorter.ascendingSort(list, size);
	}

	void descendingSort(){
		list = sorter.descendingSort(list, size);
	}

	void add(int i){
		list[size] = i;
		size++;
	}

	int get(int index) throws Exception {
		if(index < 0 && size < index){
			throw new Exception();
		}
		return list[index];
	}



	private void ascendingHeapSort() {

	}

	private void descendingHeapSort() {

	}

	private void ascendingQuickSort() {

	}

	private void descendingQuickSort() {

	}
}
