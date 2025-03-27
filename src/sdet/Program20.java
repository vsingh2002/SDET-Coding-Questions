package sdet;

// Linear Search
public class Program20 {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50, 4 };
		int key = 5;
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == key) {
				System.out.println("Element found at index :" + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element is not found");
		}

	}
}
