
public class revpymno {
	public static void main(String args[]) {
		 int n =5;
		 
         System.out.println("Reverse pyramid with Number pattern:\n");

          for (int i= 1; i<=n; i++)
         {
             for (int j=1; j<=i; j++)
             {
                 System.out.print(" ");
             }
             for (int j=i; j<=n; j++)
             {
                 System.out.print(i + " ");
             }
             System.out.println();
         }
         for (int i= 1; i<=n; i++)
         {
             for (int j=1; j<=i; j++)
             {
                 System.out.print(" ");
             }
             for (int j=i; j<=n; j++)
             {
                 System.out.print(j + " ");
             }
             System.out.println();
         }
    }
	}


