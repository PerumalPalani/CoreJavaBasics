import java.util.Scanner;
class Fibona1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		System.out.println("Enter the Fibonacci range of the output");
		int a = s.nextInt();
		System.out.print("Fibonacci numbers are:" +fib1+ " " +fib2+ " ");
		for(int i=1; i<=a; i++)
		{
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.print(fib3+ " ");
		}				
	}
}