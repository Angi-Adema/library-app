package com.angiadema.libraryapp;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		
		// Use a Scanner to prompt the user to interact with the system
		Scanner scnr = new Scanner(System.in);
		
		// Instantiate a new Inventory object to use method functionality here
		Inventory inventory = new Inventory();
		
		// Selection variable storing the user's selection
		int option = 0;
		
		// WHILE loop to handle menu options
		while (option != 6) {
			System.out.println("Menu Options:");			
			System.out.println("1. Add Book:");
			System.out.println("2. Check-Out Book:");
			System.out.println("3. Return Book:");
			System.out.println("4. Search by Title:");
			System.out.println("5. Print All Books:");
			System.out.println("6. Exit:");
			System.out.println();
			
			System.out.println("Please enter a number 1 - 5 or 6 to Exit\n");
			
			// Read user input and handle input errors then clear the input
			try {
				option = scnr.nextInt();
				scnr.nextLine();
			
					// Switch statement accepting selection and carrying out tasks according to option
					switch(option) {
					case 1:
						// Prompt user for individual inputs
						System.out.print("Please enter the book ID: ");
						int id = scnr.nextInt();
						scnr.nextLine();   // Clear buffer
				
						System.out.print("Please enter the book title: ");
						String title = scnr.nextLine();
						
						System.out.print("Please enter the book author: ");
						String author = scnr.nextLine();
						
						// Conditional preventing empty space
						if (author.isBlank()) {
							System.out.println("Author cannot be blank.\n");
						}
				
						System.out.print("Please enter the book ISBN number: ");
						String isbn = scnr.nextLine();
				
						System.out.print("Please enter number of pages: ");
						int numberOfPages = scnr.nextInt();
						scnr.nextLine();
						
						// Conditional requiring a number greater than 0
						if (numberOfPages <= 0) {
							System.out.println("Pages must be greater than 0.\n");
							break;
						}
				
						// Call parameterized constructor to create a new book object using input
						Book book = new Book(id, title, author, isbn, numberOfPages);
				
						// Call addBook() with new book object to add it to the inventory
						inventory.addBook(book);
						break;
				
					case 2:
						// Prompt user for ID input
						System.out.print("Please enter book ID: \n");
						int borrowedId = scnr.nextInt();
						scnr.nextLine();
				
						// Call borrowBook() method with the book ID to process check-out
						inventory.borrowBook(borrowedId);
						break;
			
					case 3:
						// Prompt user for ID input
						System.out.print("Please enter book ID: \n");
						int returnID = scnr.nextInt();
						scnr.nextLine();
				
						// Call returnBook() method with the book ID to process return
						inventory.returnBook(returnID);
						break;
				
					case 4: 
						// Prompt user for full or partial book title
						System.out.print("Please enter the full or partial title of book: \n");
						String titleSearch = scnr.nextLine();
				
						// Call searchByTitle() method with input full or partial title
						inventory.searchByTitle(titleSearch);
						break;
				
					case 5:
						// Call the printAll() method to print full inventory
						inventory.printAll();
						break;
				
					case 6:
						// If option 6 is selected to Exit, exit program
						System.out.println("Exiting the program. Good-bye!");
						break;
				
					default:
						System.out.println("Please enter an option 1 - 6: ");
				
				}
					
			} catch (Exception e) {
				// Handle the exception notifying the user and clearing buffer
				System.out.println("Invalid input. Please try again!");
				scnr.nextLine();
				
			}

		}
		// Close the scanner
		scnr.close();
	}
}
