package sdet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Write Data Into Text File

public class Program29 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\write.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Vishal Singh");
		bw.newLine();
		bw.write("I am Lucknow");
		System.out.println("Completed");
		bw.close();

	}
	

}
