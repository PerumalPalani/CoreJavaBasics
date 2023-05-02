import java.util.Scanner;
class While2
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number within 20");
		int a = s.nextInt();
		System.out.println("The desending orders numbers are");
		while(1 <= a)
		{
			System.out.println(a);
			a--;
		}
	}
}