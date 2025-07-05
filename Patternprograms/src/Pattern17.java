
import java.util.Scanner;

public class Pattern17 
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int count = 1;
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=n;j++)
			{
				if(count<=9)
				{
					System.out.print(" " +count++ + " ");
				}
				else
				{
					System.out.print(count++ + " ");
				}
			}
			System.out.println();
		}
	}
}
		

