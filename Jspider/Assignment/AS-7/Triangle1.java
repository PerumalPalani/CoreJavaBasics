class Triangle
{
	static void area(int b, int h)
	{
		double res = (b*h)/2;
		System.out.println("The area of Triangle is:" +res);
	}
}
class Triangle1
{
	public static void main(String args[])
	{
		Triangle.area(10,12);
	}
}