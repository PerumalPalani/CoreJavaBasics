class Cylinder
{
	static double area(int r, int h)
	{
		final double pi = 3.142;
		double res = 2*(pi*r*(r+h));
		return res;
	}

}
class Cylinder1
{
	public static void main(String args[])
	{
		double x = Cylinder.area(15, 19);
		System.out.println("The area of Cylinder is:" +x);
	}
}