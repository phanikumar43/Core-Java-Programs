//Date:-31-07-2026
/*Create a Java class to represent a restaurant table. Implement methods to reserve a table, cancel a reservation, and display the table details.

Requirements:
take below fields are different for every table,
a) tableNumber - stores the table number.
b) seats - Stores the seating capacity of the table.
c) reserved - Stores whether the table is reserved or not.

Take Below values are common for all tables,
a) restaurantName - Stores the name of the restaurant.

Instance Methods :-
a) reserveTable() - Changes the reservation status to reserved.
b) cancelReservation() - Cancels the reservation.
c) displayTableDetails() - Displays all the table information, including the restaurant name.

Static Methods :
a) changeRestaurantName() - Changes the restaurant name.
b) displayRestaurantName() - Displays the restaurant name.
Using above data members: - a)Assign different values to each table.
b) Display the details of both tables.
c) Reserve the first table.
d) Cancel the reservation of the second table.
Display the details again and observe that the updated restaurant name is reflected for both tables.
*/
package com.languagefundamentals;

public class Test4 {
	//	Static Variable
	static String restaurentName="nani";
	// Instance Variable
	int tableNumber;
	int seats;
	String reserved;
	
	void reserveTable() {
		System.out.println("The table is reserved");
	}
	
	void cancelReservation() {
		System.out.println("The table reservation is cancelled");
	}
	
	void displayTableDetails() {
		System.out.println("Restaurent Name is: "+restaurentName);
		System.out.println("Table Number is: "+tableNumber);
		System.out.println("Number of seats is: "+seats);
	}
	
	
	public static void main(String[] args) {
		Test4 t4=new Test4();
		t4.tableNumber=1;
		t4.seats=5;
		t4.displayTableDetails();
		t4.reserveTable();
		System.out.println("--------------------------------");
		
		Test4 t5=new Test4();
		t5.tableNumber=2;
		t5.seats=7;
		restaurentName="phani";
		t5.displayTableDetails();
		t5.cancelReservation();
		}

}
