import java.util.Scanner;
class Patern3
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range of the patterns");
		int n = s.nextInt();
		for (int i = 1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				if (i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i=n; i>=1; i--)
		{
			for (int j=1; j<=n; j++)
			{
				if (i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}