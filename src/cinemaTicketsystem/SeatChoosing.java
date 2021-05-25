package cinemaTicketsystem;

public class SeatChoosing {

	void display_seats()
	{
		System.out.println("\t\t\t\t\t\t\tScreen this side");
		System.out.println(" \t\t___________________________________________________");
		System.out.println(" \t\t___________________________________________________");
		System.out.println("\t   ___________________________________________________");
		System.out.println("\t      A * * * * * * * * * * * * Gold –  RS 150");
		System.out.println("\t      B * * * * * * * * * * * * Gold –  RS 150");
		System.out.println("\t   ___________________________________________________");
		System.out.println("\t      C * * * * * * * * * * * * Silver – RS 225");
		System.out.println("\t      D * * * * * * * * * * * * Silver – RS 225");
		System.out.println("\t   ___________________________________________________");
		System.out.println("\t     E * * * * * * * * * * * * Platinum –  RS 300");
		System.out.println("\t     F * * * * * * * * * * * * Platinum –  RS 300");		
		System.out.println("\n\n  Please Enter Preferred Row. Seat will be booked as per availability.");
	}
	
	String getcat(String a)
	{
		String cat;
		if(a.compareToIgnoreCase("A")==0||a.compareToIgnoreCase("B")==0)
			cat="Gold";
		else if(a.compareToIgnoreCase("C")==0||a.compareToIgnoreCase("D")==0)
			cat="Silver";
		else if(a.compareToIgnoreCase("E")==0||a.compareToIgnoreCase("F")==0)
			cat="Platinum";
		else
			cat="N/A";
		return cat;
	}
	
	int getcost(String cat)
	{
		int cost = 0;
		if(cat.compareToIgnoreCase("Gold")==0)
			cost=500;
		else if(cat.compareToIgnoreCase("Silver")==0)
			cost=900;
		else if(cat.compareToIgnoreCase("Platinum")==0)
			cost=1500;
		else
			return 0;
		return cost;
	}
}