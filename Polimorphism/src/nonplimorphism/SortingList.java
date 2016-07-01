package nonplimorphism;

public class SortingList {
	int[] list = new int[100];
	int size = 0;
	int sortId;

	public SortingList(int sortId){
		this.sortId = sortId;
	}

	void ascendingSort() {
		if(sortId == 0){
			ascendingQuickSort();
		}else if(sortId == 1){
			ascendingHeapSort();
		}
	}

	void descendingSort(){
		if(sortId == 0){
			descendingQuickSort();
		}else if(sortId == 1){
			descendingHeapSort();
		}
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
