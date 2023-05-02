class Parallelogram
{
	int area()
	{
		int b = 16;
		int h = 10;
		int res = b*h;
		return res;
	}
}
class Parallelogram1
{
	public static void main(String args[])
	{
		Parallelogram p = new Parallelogram();
		int m = p.area();
		System.out.println("the area of parallelogram is:" +m);
	}
}