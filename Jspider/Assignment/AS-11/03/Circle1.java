class Circle
{
	double area()
	{
		final double pi = 3.142;
		int r = 10;
		double res = pi*r*r;
		return res;
	}
}
class Circle1
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		double p = c.area();
		System.out.println("the area of circle is:" +p);
	}
}