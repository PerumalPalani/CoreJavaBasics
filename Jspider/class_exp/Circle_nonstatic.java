class Circle_nonstatic
{
	void area()
	{
		final double pi=3.142d;
		int r = 15;
		double res= pi*r*r;
		System.out.println(res);
	}
	public static void main(String args[])
	{
		new Circle_nonstatic().area();
	}
}