import java.util.Scanner;
class Revers1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the random number");
		int a = s.nextInt();
		int rev = 0;
		while (a!= 0)
		{
			int rem = a%10;
			rev= rem +(rev*10);
			a = a/10;
		}
		System.out.println("Enter the numbers reverse are:" +rev);
		
	}
}