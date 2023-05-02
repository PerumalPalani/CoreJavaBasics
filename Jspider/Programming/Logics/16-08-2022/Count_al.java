class Count_al
{
	public static void main(String args[])
	{
		char[] a = {'J', 'a', 'V', 'A'};
		int counta = 0;
		int countl = 0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i] >= 'A' && a[i] <= 'Z')
			{
				counta++;
			}
			if (a[i] >= 'a' && a[i] <= 'z')
			{
				countl++;
			}			
		}
		System.out.println(counta);
		System.out.println(countl);
	}
}