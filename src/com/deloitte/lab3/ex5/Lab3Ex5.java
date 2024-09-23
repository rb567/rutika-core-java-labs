package com.deloitte.lab3.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab3Ex5 {

	/**
	 * Method to count the number of characters, lines, and words in a text.
	 * 
	 * @param text The input text to analyze
	 * @return A String containing the counts of characters, lines, and words
	 */
	public static String analyzeText(String text) {
		if (text == null || text.isEmpty()) {
			return "No text provided.";
		}

		int charCount = 0;
		int lineCount = 0;
		int wordCount = 0;

		// Split the text into lines
		String[] lines = text.split("\n");
		lineCount = lines.length;

		// Iterate through each line
		for (String line : lines) {
			// Count characters
			charCount += line.length();

			// Split the line into words and count them
			String[] words = line.split("\\s+");
			wordCount += words.length;
		}

		return String.format("Characters: %d\nLines: %d\nWords: %d", charCount, lineCount, wordCount);
	}

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the text (end with an empty line):");

		StringBuilder text = new StringBuilder();
		String line;

		try {
			while ((line = reader.readLine()) != null && !line.trim().isEmpty()) {
				text.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Analyze the collected text
		String result = analyzeText(text.toString());
		System.out.println(result);
	}
}
