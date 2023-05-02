class Circle
{
	static double area(int r)
	{
		final double pi = 3.142;
		double res = pi*r*r;
		return res;
	}
}
class Circle1
{
	public static void main(String args[])
	{
		double x = Circle.area(15);
		System.out.println("the area of Circle is:" +x);
	}
		
}