package logic.solution.count;

public class TestCountableList {
	public static void main(String[] args) {
		CountableList test_add = new CountableList();
		test_add.add(1);
		test_add.add(2);
		System.out.println("expected count is 2. actual count is " + test_add.getAddCount());

		CountableList test_addAll = new CountableList();
		Object[] objcts = new Object[3];
		objcts[0] = 1;
		objcts[1] = 2;
		objcts[2] = 2;
		test_addAll.addAll(objcts);
		System.out.println("expected count is 3. actual count is " + test_addAll.getAddCount());
	}
}
