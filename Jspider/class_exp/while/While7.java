class While7
{
	public static void main(String... args)
	{
		int n = 1;
		System.out.println("\'Print the 3 table\'");
		while(n <= 50)
		{
			n++;
			if(n%3 ==0)
			{
				System.out.println(n);
			}
		}
	}
}