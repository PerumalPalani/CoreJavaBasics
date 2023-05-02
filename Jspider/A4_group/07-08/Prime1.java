import java.util.Scanner;
class Prime1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter the any integer number:");
		int a = s.nextInt();
		for (int i = 2; i<a; i++)
		{
			if (a%i == 0)
			{
				flag = false;
				break;
			}
		}
		if (flag == true)
		{
			System.out.println("It is a prime number = " +a);
		}
		else
		{
			System.out.println("It is not a prime number = " +a);
		}
	}
}