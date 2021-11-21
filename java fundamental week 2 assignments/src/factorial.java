import java.util.*;
public class factorial {
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	int z;
	long factorial;
	char ch;
	
	do {
		factorial=1;
	System.out.println("Enter the number:");
	z=sc.nextInt();
	//to find factorial of a number
	for(int i=1;i<=z;i++)
	{
		factorial=factorial*i;
	}
	System.out.println(z+"!="+factorial);
	System.out.println("Do you want to continue(y/n)");
	sc.close();
	ch=sc.next().charAt(0);
}while(ch=='y');
}
}
