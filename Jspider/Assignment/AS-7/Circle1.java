class Circle
{
	static void area(int r)
	{
		final double pi = 3.142d;
		double res = pi*r*r;
		System.out.println("The area of Circle is" +res);
	}
}
class Circle1
{
	public static void main(String args[])
	{
		Circle.area(15);
	}
}