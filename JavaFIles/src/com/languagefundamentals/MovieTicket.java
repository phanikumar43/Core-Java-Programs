//Date;-03-08-2026
//Lab Program
/*movie theatre wants to maintain information about the tickets booked for different movies.
Each ticket has its own movie name,
seat number, and booking status. Since these details are different for every ticket,
The theatre name is common for all movie tickets. If the theatre changes its name, the updated name should be reflected for every ticket.
Design a Java class named "Movieticket to manage the ticket details.
Requirements: -
Create the following variables:
* movieName
- Stores
the name of the movie.
* seatNumber
- stores the seat number allotted to the customer.
* booked
- Stores whether the ticket is booked or not.
* theatreName- Stores the name of the theatre. Initialize it with
Implement the following methods:
* bookTicket() - Marks the ticket as booked. cancelTicket() - Cancels the ticket booking.
* •displayTicketDetails() - Displays the movie name, seat number, booking status, and theatre name.
* *changeTheatreName)
- Changes the theatre name.
* •displayTheatreName() - Displays the theatre name.
In the "main() method:
> Create two Movieticket objects.
different movie names and seat numbers to each object.
› Display the details of both tickets.
> Book the first ticket.
› Cancel the second ticket.
Change the theatre name using the static method.
› Display the updated details of both tickets.
*/
package com.languagefundamentals;

public class MovieTicket {
	static String movieName;
	static String theatreName="Viswanath Theatre";
	
	int seatNumber;
	boolean booked;
	void bookTickets() {
		booked=true;
		System.out.println("Tickets are Confirmed: "+booked);
	}
	
	void cancelTickets() {
		booked=false;
		System.out.println("Tickets are Not Confirmed: "+booked);
	}
	
	void displayTicketDetails() {
		System.out.println("Movie Name is: "+movieName);
		System.out.println("Seat Number is: "+seatNumber);
		System.out.println("Booking Status is: "+booked);
		System.out.println("Theatre Name is: "+theatreName);
	}
	public static void main(String[] args) {
		MovieTicket mt=new MovieTicket();
		mt.seatNumber=1;
		mt.movieName="Con City";
		mt.bookTickets();
		mt.displayTicketDetails();
		System.out.println("----------------------------------");
		
		MovieTicket mt1=new MovieTicket();
		mt1.seatNumber=2;
		mt.movieName="Jana Nayaka";
		theatreName="Nani Multiplex";
		mt.cancelTickets();
		mt.displayTicketDetails();
		System.out.println("----------------------------------");
	}

}
