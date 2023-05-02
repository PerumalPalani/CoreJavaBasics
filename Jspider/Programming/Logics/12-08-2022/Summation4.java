class Summation4
{
	public static void main(String args[])
	{
		int a = 13465687;
		int count = 0;
		while (a!= 0)
		{
			int rem = a%10;
			if (rem%2 == 0)
			{
				count++;
			}
			a = a/10;
		}
		System.out.println("Entered numbers are even number counts are:"+count);
	}
}