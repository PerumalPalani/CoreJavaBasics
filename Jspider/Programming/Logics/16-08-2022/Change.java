import java.util.Scanner;
class Change
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String a = s.next();
		System.out.println("Enter the Finc the repalce character:");
		char b = s.next().charAt(0);
		System.out.println("Enter the replaement characters:");
		char c = s.next().charAt(0);
		System.out.println(a.replace(b, c));
	}
}