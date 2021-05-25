package cinemaTicketsystem;


import java.util.*;

public class IssueTicket {
	
	SeatChoosing s = new SeatChoosing();

	void print_ticket(String movie,String showtime,int screen,String cat, String rowch, int colch)
	{
		Date date = new Date();
		int cost = s.getcost(cat);
		System.out.println("======================== Comsats Cinemas =======================");
		System.out.println("\t\t\t\t----Ticket----");
		System.out.println("\tMovie:\t"+movie+"\t");
		System.out.print("\tTime:\t\t\t\t"+showtime);
		System.out.println("\t\t\t\t\t\tSeat:"+rowch+colch);
		System.out.print("\tCategory:\t\t\t"+cat);
		System.out.println("\t\t\t\t\tScreen: "+screen);
		System.out.println("\tDate:\t\t\t\t"+date);
		System.out.println("\tPrice:\t\t\t\tRS. "+cost);
		
		System.out.println("\tThank you for choosing us!\n\n");
	}
} 