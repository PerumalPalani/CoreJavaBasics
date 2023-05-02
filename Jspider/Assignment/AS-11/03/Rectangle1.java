class Rectangle
{
	int area()
	{
		int w = 10;
		int h = 15;
		int res = w*h;
		return res;
	}
}
class Rectangle1
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		int y = r.area();
		System.out.println("the area of Rectangle is:" +y);
	}
}
