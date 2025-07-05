import java.util.Scanner;

public class Pattern3 
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println("Enter the character");
		char ch = scan.next().charAt(0);
		/* Using for Loop
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		/* Using While Loop
		int i = 1;
		while(i <= n)
		{
			int j = 1;
			while(j<=n)
			{
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		// Using  do while Loop
		int i = 1;
		do
		{
			int j = 1;
			do
			{
				System.out.print(ch);
				j++;
			}
			while(j<=n);
			System.out.println();
			i++;
		}
		while(i<=n);
		
	}

}




