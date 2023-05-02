import java.util.Scanner;
class Calculator
{
	static void calc()
	{
	    Scanner s = new Scanner(System.in);
		System.out.println("Choose your calculator.....");
		System.out.println("1. Addition");
		System.out.println("2. Multiplication");
		System.out.println("3. Subtraction");
		System.out.println("4. Division");
		System.out.println("5. Modulous");
		System.out.println("6. Even Number");
		System.out.println("7. Odd Number");
		System.out.println("8. Factorial");
		System.out.println("9. Prime number");
		System.out.println("10. Fibonacci");
		System.out.println("11. Greater than");
		int n = s.nextInt();
		switch(n)
		{
			case 1: add();
			break;
			case 2: mul();
			break;
			case 3: sub();
			break;
			case 4: div();
			break;
			case 5: mod();
			break;
			case 6: even();
			break;
			case 7: odd();
			break;
			case 8: fact();
			break;
			case 9: prime();
			break;
			case 10: fib();
			break;
			case 11: gre();
			break;
			case 12: System.out.println("....Thank you for using!.....");
			break;
			default : System.out.println("Invalid Number!...");
			break;
		}
		System.out.println("... Did you want to continue again....");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int q = s.nextInt();
		if(q == 1)
		{
			calc();
		}
		else if(q == 2)
		{
			System.out.println("... Thank you for using this calculator!...");
		}
		else
		{
			System.out.println("...Sorry! You are entered invalid input. Restart the calculator..");
			calc();
		}
	}
	static void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		int a = l+m;
		System.out.println("The addition of Two numbers is:"+l+" + "+m+ " = " +a);
	}
	static void mul()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		int a = l*m;
		System.out.println("The multiplication of Two numbers is:"+l+" * "+m+ " = " +a);
	}
	static void sub()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		int a = l-m;
		System.out.println("The Subtraction of Two numbers is:"+l+" - "+m+" = " +a);
	}
	static void div()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		int a = l/m;
		System.out.println("The Division of Two numbers is:"+l+" / "+m+" = " +a);
	}
	static void mod()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		int a = l%m;
		System.out.println("The Modulus of Two numbers is:"+l+" % "+m+" = " +a);
	}
	static void even()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		if(l%2 == 0)
		{
			System.out.println("It is enven number: " +l);
		}
		else
		{
			System.out.println("It is odd number: " +l);
		}
		if(m%2 == 0)
		{
			System.out.println("It is even number: " +m);
		}
		else
		{
			System.out.println("It is odd number: " +m);
		}
	}
	static void odd()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		if(l%2 == 1)
		{
			System.out.println("It is odd number: " +l);
		}
		else
		{
			System.out.println("It is even number: " +l);
		}
		if(m%2 == 1)
		{
			System.out.println("It is odd number: " +m);
		}
		else
		{
			System.out.println("It is even number: " +m);
		}
	}
	static void fact()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		int fact = 1;
		for (int i = 1; i<=l; i++)
		{
			fact = fact*i;
		}
		System.out.println("the factorial number is:" +l+ " = " +fact);
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		int fact1 = 1;
		for(int j =1; j<=m; j++)
		{
			fact1 = fact1*j;
		}
		System.out.println("the factorial number is:" +m+ " = " +fact1);
	}
	static void prime()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		boolean flag = true;
		for (int i=2; i<l; i++)
		{
			if(l%i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("It is a prime number: " +l);
		}
		else
		{
			System.out.println("It is not prime number: " +l);
		}
		for (int j=2; j<m; j++)
		{
			if(m%j == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("It is a prime number: " +m);
		}
		else
		{
			System.out.println("It is not prime number: " +m);
		}
	}
	static void fib()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();		
		int f1 = 0;
		int f2 = 1;
		int f3;
		System.out.println("Fibanocci series is:" +f1+ " " +f2+ " ");
		for(int i = 1; i<=l; i++)
		{
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3+ " ");
		}
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		int f4 = 0;
		int f5 = 1;
		int f6;
		System.out.println("Fibonacci series is:" +f4+ " " +f5+ " ");
		for(int j = 1; j<=m; j++)
		{
			f6 = f4+f5;
			f4 = f5;
			f5 = f6;
			System.out.print(f6+ " ");
		}

	}
	static void gre()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int l = s.nextInt();
		System.out.println("Enter the Second number: ");
		int m = s.nextInt();
		System.out.println("Enter the third number to be compare: ");
		int o = s.nextInt();
		if((l>m) && (l>o))
		{
			System.out.println("The greater than number is: " +l);
		}
		else if(m>o)
		{
			System.out.println("The greater than number is: " +m);
		}
		else
		{
			System.out.println("The greater than number is: " +o);
		}
	}
	public static void main(String args[])
	{
		calc();			
	}

}