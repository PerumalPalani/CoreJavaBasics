class Summation6
{
	public static void main(String args[])
	{
		int a =10251001;
		int count0 = 0;
		int count1 = 0;
		while (a!= 0)
		{
			int rem = a%10;
			if (rem == 0)
			{
				count0++;
			}
			if (rem == 1)
			{
				count1++;
			}
			a = a/10;
		}
		System.out.println("Given inputs are number of 0's:" +count0+ "\tNumber of 1's:" +count1);
	}
}