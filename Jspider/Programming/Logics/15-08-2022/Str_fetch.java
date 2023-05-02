import java.util.Scanner;
class Str_fetch
{
	static void str_fet()
	{
		int[] a ={12, 30, 40, 20, 79};
		for (int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	static void str_sum()
	{
		int[] b = {2, 5, 6, 7, 8};
		for (int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
	static void str_sum_even()
	{
		int[] c = {10, 5, 8, 9, 4, 3};
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
	}
	static void str_sum_odd()
	{
		int[] d = {10, 5, 8, 9, 7,};
		for (int i=0; i<d.length; i++)
		{
			System.out.println(d[i]);
		}
	}
	static void str_count_even()
	{
		int[] e ={10, 9, 7, 6, 4 ,3};
		for (int i = 0; i<e.length; i++)
		{
			System.out.println(e[i]);
		}
	}
	static void str_count_odd()
	{
		int[] f = {9, 7, 3, 5, 6, 8};
		for (int i=0; i<f.length; i++)
		{
			System.out.println(f[i]);
		}
	}
	static void dynamic()
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = a.nextInt(); // array declaration;
		int[] b = new int[size]; // array size initialization;
		for (int i = 0; i<b.length; i++)
		{
			System.out.println("Enter the" +i+ "index values");
			int c = a.nextInt();
			b[i] = c;
		}
		// printing the dynamic input;
		for (int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Choose the choice:");
		System.out.println("1. Fetch");
		System.out.println("2. Sum");
		System.out.println("3. Sum even");
		System.out.println("4. Summ odd");
		System.out.println("5. Count even");
		System.out.println("6. Count odd");
		System.out.println("7. Dyanmic");
		int e = s.nextInt();
		switch(e)
		{
			case 1: 
				str_fet();
			break;
			case 2:
				str_sum();
			break;
			case 3:
				str_sum_even();
			break;
			case 4:
				str_sum_odd();
			break;
			case 5:
				str_count_even();
			break;
			case 6:
				str_count_odd();
			break;
			case 7:
				dynamic();
			break;
			default : break;
		}		
	}
}