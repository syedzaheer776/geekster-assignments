import java.util.*;
public class ternary {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int a,b,max; 
		System.out.println("Enter a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		max=(a>b)?a:b;
	sc.close();
		System.out.println("Max = "+max);
	}

}
