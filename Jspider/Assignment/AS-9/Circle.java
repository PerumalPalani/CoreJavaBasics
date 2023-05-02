class Circle
{
	void area()
	{
		final double pi = 3.142;
		int r = 36;
		double res = pi*r*r;
		System.out.println("The area of Circle is:" +res);
	}
	public static void main(String args[])
	{
		new Circle().area();
	}
}