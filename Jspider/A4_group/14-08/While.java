import java.util.Scanner;
class While 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the initial number");
		int a = s.nextInt();
		System.out.println("Enter the range number");
		int b = s.nextInt();

		System.out.println("the ordered \f number is:");
		while (a <= b)
		{
			System.out.println(a);
			a++;
		}
		
	}
}