class Cylinder
{
	void area()
	{
		final double pi = 3.142;
		int r = 25;
		int h = 36;
		double res = 2*(pi*r*(r+h));
		System.out.println("The area of Cylinder is:" +res);
	}
	public static void main(String args[])
	{
		new Cylinder().area();
	}
}