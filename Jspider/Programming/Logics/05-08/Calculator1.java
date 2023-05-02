import java.util.Scanner;
class Calculator1
{
	static void calc()
	{
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		System.out.println("Choose your calculator!..");
		System.out.println("1. Addition: ");
		System.out.println("2. Multiplication: ");
		System.out.println("3. Subtraction: ");
		System.out.println("4. Division: " );
		System.out.println("5. Modulus: ");
		int o = s.nextInt();
		switch(o)
		{
			case 1: int a = l+m;
			System.out.println(o+ "The addition of:" +l+ " + " +m+ " = " +a);
			break;
			case 2: int b = l*m;
			System.out.println(o+ " The multiplication of:" +l+ " * " +m+ " = " +b);
			break;
			case 3: int c = l-m;
			System.out.println(o+ "The subtraction of:" +l+ " - " +m+ " = " +c);
			break;
			case 4: int d = l/m;
			System.out.println(o+ "The divison of:" +l+ " / " +m+ " = " +d);
			break;
			case 5: int e = l%m;
			System.out.println(o+ "The Modulus of:" +l+ " % " +m+ " = " +e);
			break;
			default: System.out.println(o+ "It is invalid number");
			break;
		}
		System.out.println("....do you want to calculate again...");
		System.out.println("1. yes");
		System.out.println("2. No");
		int p = s.nextInt();
		if(p == 1)
		{
			calc();
		}
		else if(p == 2)
		{
			System.out.println("...Thank your for using this calculator!...");
		}
		else
		{
			System.out.println(p+ "It is a invalid input and try again...");
			calc();
		}		
	}
	public static void main(String args[])
	{
		calc();
	}
}