import java.util.Scanner;
public class table {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int n = sc.nextInt();
	        for(int i =1; i<=10; i++){
	            int res = n * i;
	            System.out.println(n + " * " + i + " = " + res);
	        }

	        sc.close();
	}

}
