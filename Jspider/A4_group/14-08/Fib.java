import java.util.Scanner;
class Fib
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = s.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3;
		System.out.println("The fibonacci series are:");
		System.out.print(f1+" " +f2+ " ");
		for (int i = 1; i<= a; i++)
		{
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3+ " ");
		}

	}
}