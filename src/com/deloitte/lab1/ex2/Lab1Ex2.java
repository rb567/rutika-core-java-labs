package com.deloitte.lab1.ex2;

import java.util.Scanner;

public class Lab1Ex2 {
	// Method to simulate traffic light
	public static void trafficLightSimulation(int choice) {
		switch (choice) {
		case 1:
			System.out.println("Red - Stop");
			break;
		case 2:
			System.out.println("Yellow - Ready");
			break;
		case 3:
			System.out.println("Green - Go");
			break;
		default:
			System.out.println("Invalid choice! Please enter 1, 2, or 3.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for Red, 2 for Yellow, 3 for Green:");
		int choice = scanner.nextInt();

		trafficLightSimulation(choice);
		scanner.close();
	}
}
