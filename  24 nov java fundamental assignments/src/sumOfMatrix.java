import java.util.*;
public class sumOfMatrix {

	public static int[][] inputMatrix()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int a=sc.nextInt();
		System.out.println("Enter the number of columns :");
		int b=sc.nextInt();
		int arr[][]=new int[a][b];
		System.out.println("Enter the elements :");
		for(int i=0;i<a;i++)
		{
			System.out.println("Row "+(i+1));
			for(int j=0;j<b;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}sc.close();
		return arr;
	}
	
	
		public static void printMatrix(int a[][])
		{
			int n=a.length;
			int m=a[0].length;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	
	public static void columnWise(int a[][])
	{
		int n=a.length;
		int m=a[0].length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] matrixAdd(int a[][],int b[][])
	{
		int n=a.length;
		int m=a[0].length;
		int c[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
	
	public static void main(String[] args) 
	{
	

	int arr1[][]=new int[10][10];
	System.out.println("For Matrix 1 :");
	arr1=inputMatrix();
	
	int arr2[][]=new int[10][10];
	System.out.println("For Matrix 2 :");
	arr2=inputMatrix();
	
	
	System.out.println("Matrix 1");
	printMatrix(arr1);
	System.out.println("Matrix 2");
	printMatrix(arr2);
	
	
	System.out.println("Matrix 1(Column Wise)");
	columnWise(arr1);
	System.out.println("Matrix 2(Column Wise)");
	columnWise(arr2);
	
	
	int n1=arr1.length;
	int m1=arr1[0].length;
	int n2=arr2.length;
	int m2=arr2[0].length;
		if(n1==n2 && m1 == m2)
		{
		    int res[][]=new int[n1][m1];
		
		    res=matrixAdd(arr1,arr2);
		    System.out.println("Resultant Matrix");
		    printMatrix(res);
		    System.out.println("Resultant Matrix(Column Wise)");
		    columnWise(res);
		}
	}

}
