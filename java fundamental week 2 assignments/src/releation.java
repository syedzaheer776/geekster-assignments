import java.util.*;
public class releation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		relation(a,b);
		sc.close();
	}
	public static void relation(int a,int b)
	{
		if(a==b)
		{
			System.out.println(a+" is equal to "+b);
		}
		else
		{
			System.out.print(a+" is not equal to "+b+" and ");
			if(a<b)
			{
			System.out.println(a+" is less than "+b);
		    }
		    else
		    {
		 	System.out.println(a+" is greater than "+b);	
		    }	
		}
	}

}
