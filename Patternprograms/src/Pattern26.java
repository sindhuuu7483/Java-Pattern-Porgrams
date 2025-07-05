
import java.util.Scanner;

public class Pattern26 
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
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==1 || i==2 || i==5 ||j==1)
				{
					System.out.print(ch);
				}
				else if(i==3 && j==3)
				{
					System.out.print(ch);
				}
				else if(i==4 && j==4)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
			
		}
	}

}

