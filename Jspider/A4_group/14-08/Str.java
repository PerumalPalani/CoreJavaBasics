import java.util.Scanner;
class Str
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.nextLine();
		String s2 ="";
		int count = 0;
		for (int i = s1.length()-1; i >= 0; i--)
		{
			char ch1 = s1.charAt(i);
			count++;
		}
		System.out.println(count);
	}
}