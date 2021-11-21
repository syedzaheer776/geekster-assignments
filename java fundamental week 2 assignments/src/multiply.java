import java.util.*;
public class multiply {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,b,resulti;
		float c,d,resultf;
		long e,f,resultl;
		
		
		System.out.println("Enter the integer numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		resulti=product(a,b);
		System.out.println("Answer ="+resulti);
		
		System.out.println("Enter the float numbers :");
		c=sc.nextFloat();
		d=sc.nextFloat();
		resultf=product(c,d);
		System.out.println("Answer ="+resultf);
		
		System.out.println("Enter the long numbers :");
		e=sc.nextLong();
		f=sc.nextLong();
		resultl=product(e,f);
		System.out.println("Answer ="+resultl);
		sc.close();

	}
	public static int product(int i,int j)
	{
		int result=i*j;
		return result;
	}
	public static float product(float i,float j)
	{
		float result=i*j;
		return result;
	}
	public static long product(long i,long j)
	{
		long result=i*j;
		return result;
	}

}
