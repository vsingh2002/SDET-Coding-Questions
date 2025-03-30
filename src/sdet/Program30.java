package sdet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Write Data into Text File
public class Program30 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\write.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("My Name is Vishal Singh");
		bw.newLine();
		bw.write("I have a good knowledge of Java Selenium");
		bw.newLine();
		bw.write("I am having a good technical as well as soft skills");
		bw.close();
		System.out.println("Completed");
	}

}
