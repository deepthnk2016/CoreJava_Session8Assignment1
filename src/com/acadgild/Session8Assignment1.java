package com.acadgild;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * File Handling Example Class to copy the contents of source file to target
 * file Source File testInputFile.txt is at - C:\temp Output File
 * testOuputFile.txt will be generated at - C:\temp
 */
public class Session8Assignment1 {

	public static void main(String[] args) throws IOException {
		FileInputStream inputFile = null;
		FileOutputStream outputFile = null;
		FileInputStream testFile = null;

		try {
			// Instantiate the FileIputStream and FileOutputStream objects
			inputFile = new FileInputStream("C:\\temp\\testInputFile.txt");
			outputFile = new FileOutputStream("C:\\temp\\testOutputFile.txt");

			int readLine;

			// Display the contents of the source file and copy the contents to
			// output file.
			System.out.println("-------------------------------------");
			System.out.println("Displaying contents of Source File");
			System.out.println("-------------------------------------");
			while ((readLine = inputFile.read()) != -1) {
				outputFile.write((char) readLine);
				System.out.print((char) readLine);
			}
			outputFile.close();

			// Read from the output file to verify if contents were written
			// properly.
			System.out.println("\n");
			System.out.println("-------------------------------------");
			System.out.println("Displaying contents of Target File");
			System.out.println("-------------------------------------");

			testFile = new FileInputStream("C:\\temp\\testOutputFile.txt");
			while ((readLine = testFile.read()) != -1) {
				System.out.print((char) readLine);
			}

		} finally {

			if (inputFile != null) {
				inputFile.close();
			}
			if (outputFile != null) {
				outputFile.close();
			}
			if (testFile != null) {
				testFile.close();
			}

		}
	}

}
