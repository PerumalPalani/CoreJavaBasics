class Rectangle
{
	int area()
	{
		int w = 15;
		int h = 10;
		int res = w*h;
		return res;
	}
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		int x = r1.area();
		System.out.println("The area of Rectangle is:" +x);
	}
}