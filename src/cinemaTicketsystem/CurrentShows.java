package cinemaTicketsystem;


public class CurrentShows {
	
	static String seats[][][] = new String[5][6][12];
	
	void display_show_timings()
	{
		System.out.println("\tMovies Now Playing\t\t\t\t\t\tTimings");
		System.out.print("1.	X-Men Apocalypse\t\t\t\t\t10:20\t11:30\t17:30");
		System.out.println();
		System.out.print("2.	Hitman's Wife's Bodyguard\t\t\t\t10:45\t12:30\t16:30");
		System.out.println();
		System.out.print("3.	The Tomorrow War\t\t\t\t\t10:00\t11:45\t15:30");
		System.out.println();
		System.out.print("4.	Bond 25\t\t\t\t\t\t\t12:00\t13:30\t17:30");
		System.out.println();
		System.out.print("5.	The Trial of the Chicago\t\t\t\t09:20\t11:30\t17:30");
		System.out.println();
	}
	
	String check_time(int x,String t)
	{
		switch(x)
		{
		case 1: if(t.equals("10:20")||t.equals("11:30")||t.equals("17:30")){
				return "true";
				}
				else
				{ System.out.println("Time not available"); 
				   return "false";
			    }
				
		case 2: if(t.equals("10:45")||t.equals("12:30")||t.equals("16:30")){return "true";}
				else
				{ 
					System.out.println("Time not available"); 
					return "false";
				}
				
		case 3: if(t.equals("10:00")||t.equals("11:45")||t.equals("15:30")){return "true";}
				else
				{ 	System.out.println("Time not available"); 
					return "false";
				}
			
		case 4: if(t.equals("12:00")||t.equals("13:30")||t.equals("17:30")){return "true";}
				else
				{ 	
				System.out.println("Time not available"); 
					return "false";
				}
			
		case 5: if(t.equals("9:20")||t.equals("11:30")||t.equals("17:30")){return "true";}
				else
				{ 	System.out.println("Time not available"); 
					return "false";
				}
		
		default: return "false";
		}
	}
	
	void show_empty_seats(String x,int i)
	{
			for(int j=0;j<12;j++)
				if(seats[i-1][x.charAt(0)-'A'][j]!="Full")
				{
					System.out.print(" "+(j+1));
				}
	}
	boolean check_seats(String a,int x,int i)
	{			
			if(seats[i-1][a.charAt(0)-'A'][x-1]!="Full")
						return false;
					else
						return true;
	}
	void fill_seat(String a,int b,int i)
	{
		seats[i-1][a.charAt(0)-'A'][b-1]="Full";
	}
	String getmovie(int x)
	{
		switch(x)
		{
		case 1: return "X-Men Apocalypse";
		case 2: return "Hitman's Wife's Bodyguard";
		case 3: return "The Tomorrow War";
		case 4: return "Bond 25";
		case 5: return "The Trial of the Chicago 7";
		default: return "";
		}
	}
	public static void main()
	{
	   for(int k =0; k<5;k++)	
		for(int i=0;i<6;i++)
			for(int j=0;j<12;j++)
				seats[k][i][j]="Empty";
	}
}