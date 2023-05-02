class Rectangle
{
	static int area(int w, int h)
	{
		int res = w*h;
		return res;
	}
}
class Rectangle1
{
	public static void main(String args[])
	{
		int x = Rectangle.area(22, 13);
		System.out.println("The area of Rectangle is:" +x);
	}
}
