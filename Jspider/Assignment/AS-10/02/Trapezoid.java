class Trapezoid
{
	void area(int a, int b, int h)
	{
		double res = ((a+b)*h)/2.0;
		System.out.println("The area of trapezoid is:" +res);
	}
	public static void main(String args[])
	{
		Trapezoid t1 = new Trapezoid();
		t1.area(15, 16, 10);
	}
}