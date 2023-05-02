import java.util.Scanner;
class Even1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = s.nextInt();
		for(int i=2; i<=no; i++)
		{
			if(no%2 == 0)
			{
				System.out.println("It is an even number" +i);
			}
			else
			{
				System.out.println("It is not even number" +i);
			}
		}
	}
}