class Pal1
{
	public static void main(String args[])
	{
		String s1 ="MADAM";
		String s2 ="";
		for (int i = s1.length()-1; i>=0; i-- )
		{
			char c = s1.charAt(i);
			s2 = s2+c;
		}
		System.out.println(s2);
		if (s1.equals(s2))
		{
			System.out.println("It is palindrome" +s2);
		}
		else
		{
			System.out.println("It is not palindrome" +s2);
		}
			String s3 = s1.toUpperCase();
			System.out.println(s3);
			String s4= s1.toLowerCase();
			System.out.println(s4);
			String s5 = s1.replace('A','o');
			System.out.println(s5);
			boolean s6 = s1.contains("DAM");
			System.out.println(s6);
			String s7 =s1.substring(2);
			System.out.println(s7);
			String s8 = s1.substring(1,3);
			System.out.println(s8);
			String s9="javascript";
			int count= 0;
			for(int j=0; j<=s9.length()-1; j++)
		{
				
			char c1 = s9.charAt(j);
			if ((c1=='a')||(c1=='e')||(c1=='i')||(c1=='o')||(c1=='u'))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}