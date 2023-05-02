class Rectangle1
{
	void area()
	{
		int w = 10;
		int h = 20;
		int res = w*h;
		System.out.println("the area of Rectangle is:" +res);
	}
}
class Rectangle
{
	public static void main(String args[])
	{
		Rectangle1 r1 = new Rectangle1();
		r1.area();
	}
}