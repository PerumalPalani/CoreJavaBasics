class Circle
{
	static void area()
	{
		final double pi = 3.142d;
		int r = 8;
		double res = pi*r*r;
		System.out.println("The area of circle is:" +res);
	}
}
class Circle1
{
	public static void main(String args[])
	{
		Circle.area();
	}
}