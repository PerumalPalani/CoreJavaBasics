import java.util.Scanner;
class Fact2
{
	public static void main(String args[])
	{
		int fact = 1;
		int a = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the factorial number:");
		int b = s.nextInt();
		System.out.println("Choose an choice");
		System.out.println("1.for loop");
		System.out.println("2. while loop");
		int c = s.nextInt();
		switch(c)
		{
			case 1: for (int i = a; i<=b; i++)
			{
				fact = fact*i;
			}
			System.out.println("The factorial value is:" +fact);
			break;
			case 2: while (a <= b)
			{
				fact = fact * a;
				a++;
			}
			System.out.println("The Factorial value is:" +fact);
			break;
			default: System.out.println("It is invalid input");
			break;
		}
	}
}