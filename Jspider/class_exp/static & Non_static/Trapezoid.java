class Trapezoid
{
	static int h = 10;
	void area()
	{
		int a = 5;
		int b = 6;
		double res = ((a+b)*h)/2;
		System.out.println("the area of Trapezoid is" +res);
	}
	public static void main(String args[])
	{
		new Trapezoid().area();
		System.out.println("The H vlaue for" +h);
	}
}
