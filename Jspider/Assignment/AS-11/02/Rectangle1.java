class Rectangle
{
	void area(int w, int h)
	{
		int res = w*h;
		System.out.println("the area of Rectangle is:" +res);
	}
}
class Rectangle1
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.area(15, 16);
	}
}