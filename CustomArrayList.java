public class CustomArrayList {
	private int[] arrayList;
	private int size = 0;

	public CustomArrayList() {
		arrayList = new int[10];
	}

	public void addValue(int value) {
		if (size == arrayList.length) {
			int[] tempList = new int[arrayList.length * 2];
			for (int index = 0; index < arrayList.length; index++) {
				tempList[index] = arrayList[index];
				tempList[tempList.length - 1] = value;
			}
			arrayList = tempList;
		} else {
			arrayList[size++] = value;
		}
	}

	public int size() {
		return arrayList.length;
	}

	public void remove(int index) {
		if (index >= 0 && index < this.size()) {
			int[] tempList = new int[arrayList.length - 1];
			for (int i = index; i < this.size() - 1; i++) {
				tempList[index] = arrayList[index];
				arrayList[i] = arrayList[i + 1];
			}
			arrayList = tempList;
		}
	}

	public int get(int index) {
		int val = -1;
		if (index < 0 || index >= this.size()) {
			System.out.println("Invalid Index!");
		} else {
			val = arrayList[index];
		}
		return val;
	}
}
