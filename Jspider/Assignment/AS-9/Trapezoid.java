class Trapezoid
{
	void area()
	{
		int a = 16;
		int b = 17;
		int h = 10;
		double res = ((a+b)*h)/2;
		System.out.println("The area of Trapezoid is:" +res);
	}
	public static void main(String args[])
	{
		new Trapezoid().area();
	}
}