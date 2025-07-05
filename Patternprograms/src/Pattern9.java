
import java.util.Scanner;

public class Pattern9 
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println("Enter the character");
		char ch = scan.next().charAt(0);
		for(int i = 1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			
		}
	}

}
