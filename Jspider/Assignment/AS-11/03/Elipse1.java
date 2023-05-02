class Elipse
{
	double area()
	{
		final double pi = 3.142;
		int a = 10;
		int b = 16;
		double res = pi*a*b;
		return res;
	}
}
class Elipse1
{
	public static void main(String args[])
	{
		Elipse e = new Elipse();
		double n = e.area();
		System.out.println("the area of elipse is:" +n);
	}
}
