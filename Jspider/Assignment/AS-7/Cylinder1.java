class Cylinder
{
	static void area(int r, int h)
	{
		final double pi = 3.142d;
		double res = 2*(pi*r*(r+h));
		System.out.println("The area of cylinder is:" +res);
	}
}
class Cylinder1
{
	public static void main(String args[])
	{
		Cylinder.area(20, 34);
	}
}
