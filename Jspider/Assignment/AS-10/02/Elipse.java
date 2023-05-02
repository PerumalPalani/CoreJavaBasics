class Elipse
{
	void area(int a, int b)
	{
		final double pi = 3.142;
		double res = pi*a*b;
		System.out.println("the area of Elipse is:" +res);
	}
	public static void main(String args[])
	{
		Elipse e1 = new Elipse();
		e1.area(12, 14);
	}
}