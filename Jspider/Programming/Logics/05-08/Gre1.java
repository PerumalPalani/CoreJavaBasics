import java.util.Scanner;
class Gre1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a = s.nextInt();
		System.out.println("Enter a second number:");
		int b = s.nextInt();
		System.out.println("Enter a third number:");
		int c = s.nextInt();
		System.out.println(c>((a>b)? a:b)? c:(a>b)? a:b);
	}
		
}