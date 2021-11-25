import java.util.*;
public class decimal2binary {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number :");
		int num=sc.nextInt();
		int sum=0,i=0;
		while(num!=0)
	       {
	    	  sum+=(num%10)*Math.pow(2, i);
	    	  num=num/10;
	    	  i++;
	       }
	       System.out.println("Decimal Equivalent : "+sum);
	       sc.close();
	}
}
