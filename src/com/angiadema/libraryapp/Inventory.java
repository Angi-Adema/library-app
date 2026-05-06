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
	public void borrowBook(int id) {
		
		// Loop through bookInventory to see if the ID is available
		for (int i = 0; i < bookInventory.size(); i++) {
			
			// Store current book object in a variable
			Book bookInfo = bookInventory.get(i);
			
			// Conditional to check if current book id matches entered id  
			// Remove from inventory if id matches  
			// Add book to the checked-out list and print confirmation
			if (bookInfo.getId() == id) {
				bookInventory.remove(i);
				checkedOutBooks.add(bookInfo);
				System.out.println("Book successfully borrowed.");
				return;
			} 	
		}
		// Notify user if the book is not found
		System.out.println("Book not found.");
	}
	
	// Return book by removing from checkedOutBooks and adding back to inventory
	public void returnBook(int id) {
		
		// Loop through checkedOutBooks to find the book ID
		for (int i = 0; i < checkedOutBooks.size(); i++) {
			
			// Store current book object in a variable
			Book bookInfo = checkedOutBooks.get(i);
			
			// Conditional statement to check if entered id matches current object
			// If it does then remove the book from the checkedOutBooks list
			// Add the book back into the bookInventory list and print confirmation
			if (bookInfo.getId() == id) {
				checkedOutBooks.remove(i);
				bookInventory.add(bookInfo);
				System.out.println("Book successfully returned.");
				return;
			}
		}
		// Notify user if the book was not successfully checked back in
		System.out.println("Error occurred returning book, please try again.");
		
	}
	
	// Call printBookInfo() and iterate over book collection to print all book details
	public void printAll() {
		
		// First check if there are books in the book inventory notify user if it is
		if (bookInventory.isEmpty()) {
			System.out.println("There are no books in inventory.");
			return;
		}
		
		// Use enhanced FOR loop to loop through and print book inventory list
		for (Book book : bookInventory) {
			book.printBookInfo();
			
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
