package dependency;

class SortUser {

	public static void main(String[] args) {

		SortingList quick = new SortingList(new QuickSorter());
		SortingList heap = new SortingList(new HeapSorter());

		SortingList marge = new SortingList(new MargeSorter());

	}

}
