//Date:-11-08-2026
//Lab Experiment
/*
Java:-
Create a Java class with 'VandeExpress"
name for a simple railway ticket booking system.

Requirements:
a) Create the following variables for passenger details: passengerName, age, source, destination, numberofTickets

b) Create the following variables for over all calculation:
totalTicketsBought, totalamount, price = 500

c) Create a static block that displays:
"Welcome to Vande Express thank you for choosing us".

d) Create a method bookTicket() to:
› Calculate the ticket amount.
> Update the total tickets bought.
› Update the total amount.
› Display a successful booking message.

Create a method displayBookingDetails() to display the booking details of a passenger including the number of tickets and amount.

f) Create a static method ticketCounter() to display:
› Total tickets booked by all passengers.
>Total amount collected.

In the main() method:
› Create at least *two passenger objects*.
> Assign different passenger details and different numbers of tickets.
› Call the required methods for each passenger.
› Finally, call ticketCounter() to display the overall booking details.
*Note:* Do not use constructors or method with arguments.
*/
package com.languagefundamentals;

public class VandeExpress {
	static String message="Welcome to Vande Express thank you for choosing us";
	String passengerName;
	int age;
	String source;
	String destination;
	int numberOfTickets;
	int totalTicketsBought;
	int totalamount;
	int price=500;
	int bookTicket;
	void bookTicket() {
		bookTicket=numberOfTickets*price;
		System.out.println("The Number of tickets are "+bookTicket);
		System.out.println("Total Tickets were sold on: "+totalTicketsBought);
		System.out.println("The price of tickets are: "+bookTicket);
		System.out.println("Your Tickets are Confirmed.Thanks For Booking.Happy Journey");
	}
	public static void main(String[] args) {
		VandeExpress v=new VandeExpress();
		v.numberOfTickets=5;
		v.totalTicketsBought=5;
		v.bookTicket();
	}
}