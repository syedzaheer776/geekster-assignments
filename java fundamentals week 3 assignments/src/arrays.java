import java.util.*;
public class arrays {

	
		public void sum(int ar[])
		{
			int sum=0;
			for(int i=0;i<ar.length;i++)
			{
				sum+=ar[i];
			}
			System.out.println("Sum of all elements in the array : "+sum);
		}
		
		
		public void midElement(int ar[])
		{
			int mid=(ar.length)/2;
			if(ar.length%2!=0)
			{
				System.out.println("Middle Element in the array : "+ar[mid]);
			}
			else
			{
				System.out.println("Middle Elements in the array : "+ar[mid-1]+" & "+ar[mid]);
			}
		}
		
		
		public void positive(int ar[])
		{
			String arr="";
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]>0)
				{
					arr=arr+" "+ar[i];
				}
			}
			System.out.println("Positive elements present in the array : "+arr);
		}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int []a = new int[10];
			
			System.out.println("Enter the 10 elements in the array:");
			
			for(int i=0;i<10;i++) 
			{
				a[i]=sc.nextInt();		
			}
			arrays arr=new arrays();
			arr.sum(a);
			arr.midElement(a);
			arr.positive(a);
			sc.close();

	}

}
