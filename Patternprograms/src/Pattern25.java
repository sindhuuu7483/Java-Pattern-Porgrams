
import java.util.Scanner;

public class Pattern25
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
				if(i==1 || i==5 || i==2 || j==4 || j==1)
				{
					System.out.print(ch);
				}
				else if(i==4 && j==1 && j==4)
				{
					System.out.print(ch);
				}
				else if(i==3 && j==3)
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

