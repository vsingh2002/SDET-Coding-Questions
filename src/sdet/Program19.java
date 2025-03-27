package sdet;

import java.util.HashSet;

// Find duplicate elements in an array
public class Program19 {

	public static void main(String[] args) {
		String ar[] = { "java", "C", "Python", "java" };
		// Approach 1
		/*
		 * boolean flag = false; for (int i = 0; i <= ar.length - 1; i++) { for (int j =
		 * i + 1; j <= ar.length - 1; j++) { if (ar[i] == ar[j]) {
		 * System.out.println("Duplicate elements found :" + ar[i]); flag = true; } } }
		 * if (flag == false) { System.out.println("Duplicate elements not found"); }
		 */
		// Approach 2
		HashSet<String> duplicates = new HashSet<String>();
		boolean flag = false;
		for (String a : ar) {
			if (duplicates.add(a) == false) {
				System.out.println("Found duplicate elements");
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println("Not found duplicate");
		}
	}
}
