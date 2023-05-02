import java.util.Scanner;
class Prime2
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range of prime number");
		int a = s.nextInt();
		for (int i = 2; i<=a; i++)
		{
			boolean flag = true;
			for (int j = 2; j<i; j++)
			{
				if (i%j == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag == true)
			{
				System.out.println("It is prime number = " +i);
			}			
		}
	}
}