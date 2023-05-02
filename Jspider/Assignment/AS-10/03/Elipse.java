class Elipse
{
	double area()
	{
		final double pi = 3.142;
		int a = 8;
		int b = 9;
		double res = pi*a*b;
		return res;
	}
	public static void main(String args[])
	{
		Elipse e1 = new Elipse();
		double x = e1.area();
		System.out.println("the area of Elipse is:" +x);
	}
}
