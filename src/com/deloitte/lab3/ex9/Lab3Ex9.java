package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Lab3Ex9 {

	/**
	 * Calculates the duration between the given date and the current date.
	 * 
	 * @param dateString The date in the format "yyyy-MM-dd"
	 * @return A string representing the duration in days, months, and years
	 */
	public static String calculateDuration(String dateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate inputDate;

		try {
			inputDate = LocalDate.parse(dateString, formatter);
		} catch (DateTimeParseException e) {
			return "Invalid date format. Please use yyyy-MM-dd.";
		}

		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(inputDate, currentDate);

		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();

		return String.format("Duration: %d years, %d months, and %d days", years, months, days);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a date in the format yyyy-MM-dd:");
		String inputDate = scanner.nextLine();
		scanner.close();

		String result = calculateDuration(inputDate);
		System.out.println(result);
	}
}
