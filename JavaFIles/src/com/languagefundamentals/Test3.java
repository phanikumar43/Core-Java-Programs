//Date:-30-07-2026
/*Todays Assignment: -
Java: -
A library wants to maintain the details of its books. Each book has its own unique information, while the library name and librarian are common for all books. The system should display book details and allow a book to be issued only when copies are available.
Create a class LibraryBook with the following members:

Instance Variables:- bookId (int), booktitle (string) , authorName (String) , availablecopies (int) 

static Variables:- LibraryName (String) , LibrarianName (String)

Instance Methods:-
displayBookdetails() - Displays the complete details of a book. 
issueBook -> Reduces the available copies by one if copies are available.

Static Methods
displayLibraryDetails) - Displays the library name and librarian name. changeLibrarian() - Updates the librarian name for all books.
*/
package com.languagefundamentals;

public class Test3 {
	//Static Variables	
	static String libraryName="kumar Library";
	static String librarianName="Phani";
	
	//Instance Variable
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies=10;
	int book1;
	int availableCopies1=10;
	
	void displaybookdetails() {
		System.out.println("Book Id is: "+bookId);
		System.out.println("Book Title is: "+bookTitle);
		System.out.println("Book Author is: "+authorName);
		System.out.println("Available Copies are: "+availableCopies);
	}
	
	void issuebook() {
//		availableCopies=availableCopies-1;
		availableCopies--;
	}
	
	void issuebook1() {
		availableCopies1--;
	}
	
	void LibrarianDetails() {
		System.out.println("Library Name is: "+libraryName);
		System.out.println("Librarian Name is: "+librarianName);
	}
	public static void main(String[] args) {
		Test3 t3=new Test3();
			t3.bookId=1;
			t3.bookTitle="Bahubali";
			t3.authorName="nani";
//			t3.availableCopies=10;
		t3.displaybookdetails();
			t3.issuebook();
			
			t3.LibrarianDetails();
			System.out.println("-------------------------------");
			
			Test3 t4=new Test3();
//			String librarianName="Vijay";
			t3.bookId=2;
			t3.bookTitle="Bahubali2";
			t3.authorName="nani";
//			t3.availableCopies=10;
			t3.displaybookdetails();
			librarianName="kumar";
			t3.issuebook1();
			
			t3.LibrarianDetails();
			System.out.println("----------------------------------");
	}

}
