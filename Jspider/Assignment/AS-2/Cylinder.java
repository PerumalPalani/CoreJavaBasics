class Cylinder
{
	static void area()
	{
		final double pi = 3.142d;
		int r = 5;
		int h = 6;
		double res = 2*pi*r*(r+h);
		System.out.println("The area of Cylinder is:" +res);
	}
	public static void main(String args[])
	{
		area();
	}
}