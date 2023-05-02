class Rectangle
{
	void area()
	{
		int w = 20;
		int h = 10;
		int res = w*h;
		System.out.println("the area of rectangle is:" +res);
	}
	public static void main(String args[])
	{
		new Rectangle().area();
	}
}