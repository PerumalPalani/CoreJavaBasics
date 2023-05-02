class circle
{
	static double area()
	{
		final double pi = 3.142d;
		int r = 5;
		double res = pi*r*r;
		return res;
	}
	public static void main(String args[])
	{
		double x = area();
		System.out.println("The area of circle is:" +x);
	}
}