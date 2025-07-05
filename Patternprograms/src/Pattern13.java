import java.util.Scanner;

public class Pattern13 
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
			for(int j=1;j<=(n-i+1);j++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		for(int i = 2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=(10-(2*i)+1);j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

