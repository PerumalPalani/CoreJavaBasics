class Parallelogram
{
	void area(int b, int h)
	{
		int res = b*h;
		System.out.println("the area of parallelogram is:" +res);
	}
	public static void main(String args[])
	{
		Parallelogram p1 = new Parallelogram();
		p1.area(12, 15);
	}
}