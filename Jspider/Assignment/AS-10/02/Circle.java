class Circle
{
	void area(int r)
	{
		final double pi =3.142;
		double res = pi*r*r;
		System.out.println("the area of circle is:" +res);
	}
	public static void main(String args[])
	{
		Circle c1 = new Circle();
		c1.area(7);
	}
}