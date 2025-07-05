
import java.util.Scanner;

public class Pattern21 
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int count = 1;
		for(int i =1;i<=5;i++)
		{
			for(int j =1;j<=5;j++)
			{
				if(count<=9)
				{
					System.out.print("0"+ count++ +" ");
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

