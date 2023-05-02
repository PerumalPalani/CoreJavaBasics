import java.util.Scanner;
class Fact1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		long fact = 1;
		System.out.println("Enter the number");
		int a = s.nextInt();
		for (int i = 2; i<=a; i++)
		{
			fact = fact*i;
			
		}
		System.out.println("The factorial number of is" +a+ " = " +fact);
	}
}