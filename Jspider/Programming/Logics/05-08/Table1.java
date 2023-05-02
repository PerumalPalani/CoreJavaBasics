import java.util.Scanner;
class Table1
{
	static void tables()
	{
		System.out.println("Enter the table number ...:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the number of limits:");
		int m = s.nextInt();
		for (int i = 1; i<=m; i++)
		{
			System.out.println(i+ " * " +n+ " = " +(n*i));

		}
		System.out.println("End the tables, Want to continue");
		System.out.println("1. yes");
		System.out.println("2. No");
		int o = s.nextInt();
		switch(o)
		{
			case 1 : tables();
			break;
			case 2 : System.out.println("Thank you for using!");
			break;
			default : System.out.println("Invlid input!");
			break;
		}
	}
	public static void main(String args[])
	{
		tables();
	}
		
}