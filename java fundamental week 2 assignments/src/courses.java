import java.util.*;
public class courses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String za;
		int year;
		System.out.println("Enter the Branch: (in CAPS)\n1. ECE\n2. CSE\n3. MECH");
		za=sc.nextLine();
		System.out.println("Enter the Year of study :");
		year=sc.nextInt();
		System.out.println("\nCourses :");
		sc.close();
		
		if(year == 1)
		{
			System.out.println(" English\n Maths\n Science");
		}
		
		
		else if(year == 2)
		{
			switch(za)
			{
			case "ECE":
				System.out.println(" Micro processors\n Logic switching theory");
				break;
			case "CSE":
				System.out.println(" Operating System\nJava\n Data Structure");
				break;
			case "MECH":
				System.out.println(" Drawing \n Manufacturing Machines");
				break;
			default:	
				System.out.println("Invalid Choice");
			}
		}
		
		
		else if(year == 3)
		{
			switch(za)
			{
			case "ECE":
				System.out.println(" Fundamentals of Logic Design\n Microelectronics");
				break;
			case "CSE":
				System.out.println("Computer Organization\n MultiMedia");
				break;
			case "MECH":
				System.out.println(" Internal Combustion Engines\n Mechanical Vibration");
				break;
			default:	
				System.out.println("Invalid Choice");
			}
		}
		
		else if(year == 4)
		{
			switch(za)
			{
			case "ECE":
				System.out.println(" Embedded System\n Image Processing");
				break;
			case "CSE":
				System.out.println(" Data Communication and Networks\n MultiMedia");
				break;
			case "MECH":
				System.out.println(" Production Technology\n Thermal Engineering");
				break;
			default:	
				System.out.println("Invalid Choice");
			}
		}
		else
		{
			System.out.println("Enter year of study between 1 to 4");
		}

	}

}
