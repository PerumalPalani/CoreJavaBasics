class Trapezoid
{
	static void area(int a, int b, int h)
	{
		double res = ((a+b)*h)/2;
		System.out.println("The area of the Trapezoid is:" +res);
	}
	public static void main(String args[])
	{
		area(5, 10, 15);
	}
}