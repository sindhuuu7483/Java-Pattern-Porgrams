
public class Pattern23 
{
	public static void main(String []args)
	{
		int n = 4;
		int evencount=2;
		int oddcount=1;
		for(int i = 1;i<=n/2;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if(evencount<=9)
				{
					System.out.print("0" + evencount++ + " ");
				}
				else
				{
					System.out.print(evencount++  + " ");
				}
			}
			System.out.println();
				
		}
		
	}

}

