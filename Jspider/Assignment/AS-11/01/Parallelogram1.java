class Parallelogram
{
	void area()
	{
		int b = 15;
		int h = 16;
		int res = b*h;
		System.out.println("the area of parallelogram is:" +res);
	}
}
class Parallelogram1
{
	public static void main(String args[])
	{
		Parallelogram p = new Parallelogram();
		p.area();
	}
}