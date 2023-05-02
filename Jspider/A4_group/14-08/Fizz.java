import java.util.Scanner;
class Fizz
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = s.nextInt();
		if((a % 3 == 0) && (a % 5 == 0))
		{
			System.out.println("Fizz buzz");
		}
		else if(a % 3 == 0)
		{
			System.out.println(" Fizz");
		}
		else if (a % 5 == 0)
		{
			System.out.println("Buzz");
		}
		else 
		{
			System.out.println("It is not suitable number:");
		}
	}
}