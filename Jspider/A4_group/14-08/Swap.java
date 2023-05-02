import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = s.nextInt();
		System.out.println("Enter a number:");
		int b = s.nextInt();
		System.out .println("Choose an choice");
		System.out.println("1. Swap using 3rd variables");
		System.out.println("2. Swap without 3rd");
		int c = s.nextInt();
		switch(c)
		{
			case 1: int d = a;
			a = b;
			b= d;
			System.out.println(a+" " +b+ "");
			break;
			case 2: a = a+ b;
			b = a - b;
			a = a - b;
			System.out.println(a+ " " +b+ " ");
			break;
			default : System.out.println("Invalid choice");
			break;
		}
	}
}