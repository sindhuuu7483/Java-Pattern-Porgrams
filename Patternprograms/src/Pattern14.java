import java.util.Scanner;

public class Pattern14 
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
			for(int j = 1;j<=n;j++)
			{
				System.out.printf(" ");
			}
			for(int j = 1;j<=n;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}

}

