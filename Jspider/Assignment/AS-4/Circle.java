class Circle
{
	static void area(int r)
	{
		final double pi = 3.142d;
		double res = pi*r*r;
		System.out.println("The area of circle is:" +res);
	}
	public static void main(String args[])
	{
		area(5);
	}
}