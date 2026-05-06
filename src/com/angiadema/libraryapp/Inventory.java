package com.angiadema.libraryapp;

import java.util.ArrayList;

public class Inventory {

	// ArrayList to store available book inventory
	private ArrayList<Book> bookInventory = new ArrayList<>();
	
	// ArrayList to store checked-out books
	private ArrayList<Book> checkedOutBooks = new ArrayList<>();
	
	// Add books to the inventory and print confirmation message
	public void addBook(Book book) {
		bookInventory.add(book);
		System.out.println("Book added to the library.");
	}
	
	// Remove book from inventory and store in checkedOutBooks
	public void borrowBook() {
		
	}
	
	// Return book by removing from checkedOutBooks and adding back to inventory
	public void returnBook() {
		
	}
	
	// Call printBookInfo() and iterate over book collection to print all book details
	public void printAll() {
		
		// First check if there are books in the book inventory notify user if it is
		if (bookInventory.isEmpty()) {
			System.out.println("There are not books in inventory.");
			return;
		}
		
		// Use enhanced FOR loop to loop through and print book inventory list
		for (Book bookList : bookInventory) {
			bookList.printBookInfo();
			
			// Add an empty line between the printed book objects
			System.out.println();
		}
		
	}
	
	// Search book inventory and return matching or partially matching titles
	public void searchByTitle(String title) {
		
	}
	
	// Add helper methods to handle edge cases (user returns book when none have been checked out)
	public void getMainInventoryCount() {
		
	}
}
