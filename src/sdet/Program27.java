package sdet;

//  Reverse Each Word in a String
public class Program27 {
	public static void main(String[] args) {
		String st = "Welcome to Learning Selenium"; // Original String
		String[] words = st.split(" "); // Splitting String in words
		String reverseString = " ";
		for (String w : words) {
			String reverseWord = "";
			for (int i = w.length() - 1; i >= 0; i--) // Welcome
			{
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";

		}
		System.out.println(reverseString);

	}

}
