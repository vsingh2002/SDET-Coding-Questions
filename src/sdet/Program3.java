package sdet;

// Reverse a String
public class Program3 {
	public static void main(String[] args) {
		String s = "Vishal";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			rev = ch + rev;
		}
		System.out.println("After reversing the String is:" + rev);
	}

}
