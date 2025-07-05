import java.util.Scanner;

public class Pattern6 
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
			for(int j = 1;j<=(n-i+1);j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
