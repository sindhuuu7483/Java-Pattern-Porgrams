import java.util.Scanner;
public class Pattern2 
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println("Enter the character");
		char ch = scan.next().charAt(0);
		/* Using for Loop
		for(int i = 1;i <= n;i++)
		{
			System.out.println(ch);
		}
		*/
		/*Using while Loop
		int i = 1;
		while(i<=n)
		{
			System.out.println(ch);
			i++;
		}
		*/
		// Using do while Loop
		int i = 1;
		do
		{
			System.out.println(ch);
			i++;
		}
		while(i<=n);
	}

}

