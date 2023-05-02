import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = s.nextInt();
		boolean flag = true;
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
			System.out.println("It is a prime number:" +a);
		}
		else
		{
			System.out.println("It is not a prime Number:" +a);
		}
	}
}