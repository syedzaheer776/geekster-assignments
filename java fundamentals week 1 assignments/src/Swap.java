import java.util.Scanner;
public class Swap {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the First number : ");
	        int a = sc.nextInt();
	        System.out.print("Enter the Second number : ");
	        int b = sc.nextInt();

	        a=a+b;
	        b=a-b;
	        a=a-b;

	        System.out.println("First number = " + a +  " and Second number = " + b );

	        sc.close();
	}

}
