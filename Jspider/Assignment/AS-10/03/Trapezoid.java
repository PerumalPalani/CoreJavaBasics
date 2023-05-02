class Trapezoid
{
	double area()
	{
		int a = 10;
		int b = 12;
		int h = 6;
		double res = ((a+b)*h)/2.0;
		return res;
	}
	public static void main(String args[])
	{
		Trapezoid t1 = new Trapezoid();
		double x = t1.area();
		System.out.println("the area of Trapezoid is:" +x);
	}
}
