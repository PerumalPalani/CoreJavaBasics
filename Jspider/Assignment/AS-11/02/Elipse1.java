class Elipse
{
	void area(int a, int b)
	{
		final double pi = 3.142;
		double res = pi*a*b;
		System.out.println("the area of elipse is:" +res);
	}
}
class Elipse1
{
	public static void main(String args[])
	{
		Elipse e = new Elipse();
		e.area(15, 16);
	}
}
