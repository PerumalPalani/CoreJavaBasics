class Circle
{
	double area()
	{
		final double pi = 3.142;
		int r = 16;
		double res = pi*r*r;
		return res;
	}
	public static void main(String args[])
	{
		Circle c1 = new Circle();
		double x = c1.area();
		System.out.println("the area of Circle is:" +x);
	}
}