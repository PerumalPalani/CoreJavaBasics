class Trapezoid
{
	static double area()
	{
		int a = 5;
		int b = 6;
		int h = 8;
		double res = ((a+b)*h)/2;
		return res;
	}
	public static void main(String args[])
	{
		double z = area();
		System.out.println("the area of Trapezoid is:" +z);
	}
}
