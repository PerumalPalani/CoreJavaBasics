class While5
{
	public static void main(String... args)
	{
		int n = 0;
		System.out.println("Print the Odd numbers:");
		while(n <= 25)
		{
			n++;
			if(n%2 != 0)
			{
				System.out.println(n);
			}
		}
	}
}