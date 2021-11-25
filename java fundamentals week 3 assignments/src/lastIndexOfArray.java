import java.util.*;
public class lastIndexOfArray {
	public static void lastindex(int a[],int n)
	{
		int lindex=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
			lindex=i;
			}
		}
		System.out.println("Last Index of "+n+" = "+lindex);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index;
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
    sc.close();
	  System.out.println("Enter the element whose index is to be found :");
	  index=sc.nextInt();
	  
	  lastindex(a,index);
	}
}

