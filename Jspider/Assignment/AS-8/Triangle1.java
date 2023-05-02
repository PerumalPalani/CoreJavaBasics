class Triangle
{
	static double area(int b, int h)
	{
		double res = (b*h)/2;
		return res;
	}
}
class Triangle1
{
	public static void main(String args[])
	{
		double x = Triangle.area(8, 9);
		System.out.println("The area of Triangle is" +x);
	}
}