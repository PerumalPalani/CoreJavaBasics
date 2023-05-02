class While4
{
	public static void main(String args[])
	{
		int n = 59;
		System.out.println("The Desending ordered even numbers:");
		while (n >= 1)
		{
			n--;
			if(n%2 ==0)
			{
				System.out.println(n);
			}
		}
	}
}