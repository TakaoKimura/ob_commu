package marge;

public class SortingList {
	int[] list = new int[100];
	int size = 0;
	Sorter sorter;

	public SortingList(int sortId){
		if(sortId == 0){
			sorter = new QuickSorter();
		}else if(sortId == 1){
			sorter = new HeapSorter();
		}else if(sortId == 2){
			sorter = new MargeSorter();
		}
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
