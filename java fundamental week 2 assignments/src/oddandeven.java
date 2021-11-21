import java.util.*;
public class oddandeven {

	
		public static void check(int n)
		{
			if (n%2==0)
				System.out.println("Even Number");
			else
				System.out.println("Odd Number");
		}
		public static void main(String args[])
		{
			
			Scanner sc = new Scanner(System.in);
			int num;
			System.out.println("Enter the number : ");
			num=sc.nextInt();
			sc.close();
			check(num);

	}

}
