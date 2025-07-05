import java.util.Scanner;

public class Pattern28
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
			for(int j=1;j<=(10-2*i+1);j++)
			{
				if(i==1 || i==5 || j==1 || j==7 )
				{
					System.out.print(ch);
				}
				else if(i==4 && j==3)
				{
					System.out.print(ch);
				}
				else if(i==3 && j==5)
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

