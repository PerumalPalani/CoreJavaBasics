class Trapezoid
{
	void area()
	{
		int a = 15;
		int b = 16;
		int h = 12;
		double res = ((a+b)*h)/2.0;
		System.out.println("the area of trapezoid is:" +res);
	}
	public static void main(String... args)
	{
		Trapezoid T1 = new Trapezoid();
		T1.area();
	}
}