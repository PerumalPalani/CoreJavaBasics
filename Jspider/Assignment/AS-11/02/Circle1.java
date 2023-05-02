class Circle
{
	void area(int r)
	{
		final double pi = 3.142;
		double res = pi*r*r;
		System.out.println("the area of Circle is:" +res);
	}
}
class Circle1
{
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.area(10);
	}
}