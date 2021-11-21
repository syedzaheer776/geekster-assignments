import java.util.*;
public class lengthOfDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,digit;
		char ch;
		
		do {
			digit=0;
		System.out.println("Enter the number:");
		a=sc.nextInt();
		
		do
		{
			digit++;
			a/=10;
		}while(a!=0);
		if(digit==1)
		{
           System.out.println("The number is a one digit number");	
		}
		else if(digit==2)
		{
			System.out.println("The number is a two digit number");
		}
		else if(digit==3)
		{
			System.out.println("The number is a three digit number");
		}
		else if(digit==4)
		{
			System.out.println("The number is a four digit number");
		}
		else if(digit==5)
		{
			System.out.println("The number is a five digit number");
		}
		else
		{
			System.out.println("The number has more than five digits !!!");
		}
		sc.close();
		System.out.println("Do you want to continue(y/n)");
		ch=sc.next().charAt(0);
	}while(ch=='y');

	}

}
