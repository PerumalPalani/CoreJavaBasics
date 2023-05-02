class Triangle
{
	void area()
	{
		int b = 16;
		int h = 19;
		double res = (b*h)/2;
		System.out.println("The area of Triangle is:" +res);
	}
	public static void main(String args[])
	{
		new Triangle().area();
	}
}