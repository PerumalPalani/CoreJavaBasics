class Triangle
{
	double area()
	{
		int b = 10;
		int h = 12;
		double res = (b*h)/2.0;
		return res;
	}
}
class Triangle1
{
	public static void main(String args[])
	{
		Triangle t = new Triangle();
		double x = t.area();
		System.out.println("the area of Triangle is:" +x);
	}
}
