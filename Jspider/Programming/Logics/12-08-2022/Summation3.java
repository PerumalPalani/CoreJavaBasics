class Summation3
{
	public static void main(String args[])
	{
		int m = 14567;
		int sum = 0;
		while (m!= 0)
		{
			int rem = m%10;
			sum = sum+(rem*rem*rem);
			m = m/10;
		}
		System.out.println(sum);
	}

}