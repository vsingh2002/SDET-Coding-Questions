package sdet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Read Data From Text File
public class Program28 {
	public static void main(String[] args) throws IOException {
		// Approach 1 - Using FileReader and Buffered Reader
		FileReader fl = new FileReader("D:\\Workspace\\CodingInterview\\Welcome to Java.txt");
		BufferedReader br = new BufferedReader(fl);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		// Approach 2 - Using Scanner and File
		File f = new File("D:\\\\Workspace\\\\CodingInterview\\\\Welcome to Java.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
