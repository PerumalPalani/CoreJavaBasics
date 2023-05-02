import java.util.Scanner;
class Pal
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the random number");
		int a = s.nextInt();
		int rev = 0;
		int temp = a;
		while (a!=0)
		{
			int rem = a%10;
			rev = (rev*10)+rem;				
			a = a/10;						
		}
		if (temp == rev)
		{
			System.out.println("Entered value is Palindrome:" +rev);
		}
		else
		{
			System.out.println("Entered value is Not Palindrome:" +rev);
		}
	}
}