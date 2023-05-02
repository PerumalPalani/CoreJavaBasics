class Circle
{
	void area()
	{
		final double pi = 3.142;
		int r = 5;
		double res = pi*r*r;
		System.out.println("the area of cicle is:" +res);
	}
}
class Circle1
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.area();
	}
}
