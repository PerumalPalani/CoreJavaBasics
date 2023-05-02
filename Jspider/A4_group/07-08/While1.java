import java.util.Scanner;
class While1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the initial value of while loop");
		int a = s.nextInt();
		System.out.println("Enter the range of while loop");
		int b = s.nextInt();
		System.out.println("Print the order numbers");
		while (a <= b)
		{
			System.out.println(a);
			a++;	
		}		
	}
}