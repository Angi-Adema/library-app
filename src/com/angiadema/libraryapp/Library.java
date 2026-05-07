package com.angiadema.libraryapp;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		
		// Use a Scanner to prompt the user to interact with the system
		Scanner scnr = new Scanner(System.in);
		
		// Instantiate a new Inventory object to use the functionality here
		Inventory inventory = new Inventory();
		
		// Selection variable storing the user's selection
		int option = 0;
		
		// WHILE loop to handle menu options
		while (option != 6) {
			System.out.println("Menu Option:");
			System.out.println("1. Add Book:");
			System.out.println("2. Check-Out Book:");
			System.out.println("3. Return Book:");
			System.out.println("4. Search by Title:");
			System.out.println("5. Print All Books:");
			System.out.println("6. Exit:");
			System.out.println("Please enter a number 1 - 5 or 6 to Exit");
			
			// Read user input then clear the input
			option = scnr.nextInt();
			scnr.nextInt();
			
			// Switch statement accepting selection and performing task
			switch(option) {
			case 1:
				System.out.println("Please enter book ID: ");
				int id = scnr.nextInt();
				scnr.nextInt();
				
			}
			
		}
		
		// Close the scanner
		scnr.close();

	}

}
