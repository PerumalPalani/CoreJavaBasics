class Triangle
{
	void area()
	{
		int b = 5;
		int h = 9;
		double res = (b*h)/2.0;
		System.out.println("The area of Triangle is:" +res);
	}
	public static void main(String... args)
	{
		Triangle T1 = new Triangle();
		T1.area();
	}
}

