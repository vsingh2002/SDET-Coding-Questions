package sdet;

// Max and Min in an array
public class Program18 {
	public static void main(String[] args) {
		int ar[] = { 100, 20, 30, 50, 7 };
		int max = ar[0];
		for (int i = 1; i <= ar.length - 1; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.println("Maximum element in an array is :" + max);
		int min = ar[0];
		for (int i = 1; i <= ar.length - 1; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("Minimum element in an array is :" + min);
	}

}
