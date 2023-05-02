class Rectangle
{
	void area(int w, int h)
	{
		int res = w*h;
		System.out.println("The area of Rectangle is:" +res);
	}
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.area(12, 13);
	}
}
