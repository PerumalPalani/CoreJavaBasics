class Trapezoid1
{
	int h = 15;
	void area()
	{
		int a = 10;
		int b = 15;
		double res = ((a+b)*h)/2;
		System.out.println("the area of trapezoid is:" +res);
	}
	void rectangle()
	{
		int w = 15;
		int res = w*h;
		System.out.println("The reactangle area is:" +res);
	}
	void parallelogram()
	{
		int b = 10;
		int res = b*h;
		System.out.println("The area of Parallelogram is:" +res);
	}
	static void cylinder()
	{
		final double pi = 3.142;
		int r = 8;
		double  res = 2*(pi*r*(r+new Trapezoid1().h) );
		System.out.println("the area of cylinder is:" +res);
	}

	public static void main (String args[])
	{
		new Trapezoid1().area();
		System.out.println("the h value is" +new Trapezoid().h);
		new Trapezoid1().rectangle();
		new Trapezoid1().parallelogram();
		cylinder();
	}
}