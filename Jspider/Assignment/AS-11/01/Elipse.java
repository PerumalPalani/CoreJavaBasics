class Elipse1
{
	void area()
	{
		final double pi = 3.142;
		int a = 10;
		int b = 11;
		double res = pi*a*b;
		System.out.println("the area of elipse is:" +res);
	}
}
class Elipse
{
	public static void main(String args[])
	{
		Elipse1 e1 = new Elipse1();
		e1.area();
	}
}