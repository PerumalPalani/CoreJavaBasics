class Triangle
{
	static double area()
	{
		int b = 5;
		int h = 6;
		double res = (b*h)/2;
		return res;
	}
	public static void main(String args[])
	{
		double x = area();
		System.out.println("The area of Triangle is:" +x);
	}
}
