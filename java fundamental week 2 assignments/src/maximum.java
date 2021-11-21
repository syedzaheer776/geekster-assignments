
public class maximum{

	
		public static int compare(int n1,int n2)
		{
			int m=Math.max(n1, n2);
			return m;
		}
		
		public static int compare(int n1,int n2,int n3)
		{
			int m=Math.max(Math.max(n1, n2),n3);
			return m;
		}
		
		public static int compare(int n1,int n2,int n3,int n4)
		{
			int m=Math.max(Math.max(Math.max(n1, n2),n3),n4);
			return m;
		}
		public static void main(String[] args) {
			int maximum;
			System.out.println("M A X I M U M\n");
			maximum=compare(897,654);
			System.out.println("Maximum = "+maximum);

	}

}
