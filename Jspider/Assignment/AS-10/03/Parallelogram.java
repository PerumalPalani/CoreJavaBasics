class Parallelogram
{
	int area()
	{
		int b = 10;
		int h = 16;
		int res = b*h;
		return res;
	}
	public static void main(String args[])
	{
		Parallelogram p1 = new Parallelogram();
		int x = p1.area();
		System.out.println("the area of Parallelogram is:" +x);
	}
}