class Summation2
{
	public static void main(String args[])
	{
		int n = 17894;
		int sum = 0;
		while (n!= 0)
		{
			int rem = n%10;
			sum = sum+(rem * rem);
			n = n/10;
		}
		System.out.println(sum);
	}
}