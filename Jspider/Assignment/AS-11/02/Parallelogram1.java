class Parallelogram
{
	void area(int b, int h)
	{
		int res = b*h;
		System.out.println("the area of Parallelogram is:" +res);
	}
}
class Parallelogram1
{
	public static void main(String args[])
	{
		Parallelogram p = new Parallelogram();
		p.area(16, 18);
	}
}