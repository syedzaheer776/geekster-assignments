import java.util.*;
public class report {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int z;
		String grade;

		System.out.println("Enter the marks:");
		z=sc.nextInt();
		
		grade=marks(z);
		System.out.println("Your grade : "+grade);
		sc.close();
	}
	public static String marks(int z)
	{
		String grade=" ";
		if((z>=90)&&(z<=100))
		{
			grade="A+";
		}
		else if((z>=80)&&(z<=89))
		{
			grade="A";
		}
		else if((z>=70)&&(z<=79))
		{
			grade="B";
		}
		else if((z>=60)&&(z<=69))
		{
			grade="C";		
		}
		else if((z>=50)&&(z<=59))
		{
			grade="D";		
		}
		else if(z<50)
		{
			grade="FAIL";
		}
		else
		{
			grade="Invalid";
		}
		return grade;
	}

}
