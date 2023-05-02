class Triangle
{
	void area(int b, int h)
	{
		double res = (b*h)/2.0;
		System.out.println("the area of triangle is" +res);
	}
	public static void main(String args[])
	{
		Triangle T1 = new Triangle();
		T1.area(12, 14);
	}
}