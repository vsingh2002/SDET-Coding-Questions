package sdet;

// Binary Search - Elements should be in sorted order
public class Program21 {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, 40, 50 };
		boolean flag = false;

		int key = 40;
		int low = 0;
		int high = ar.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar[mid] == key) {
				System.out.println("Element found ");
				flag = true;
				break;
			} else if (ar[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (flag == false) {
			System.out.println("Element is not found");
		}
	}

}
