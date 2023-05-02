class Rectangle
{
	void area()
	{
		int w = 9;
		int h = 15;
		int res = w*h;
		System.out.println("the area of Rectangle is:" +res);
	}
	public static void main(String... args)
	{
		Rectangle R1 = new Rectangle();
		R1.area();
	}
}
