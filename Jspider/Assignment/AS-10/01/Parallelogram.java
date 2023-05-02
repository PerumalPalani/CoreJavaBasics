class Parallelogram
{
	void area()
	{
		int b = 12;
		int h = 16;
		int res = b*h;
		System.out.println("the area of parallelogram is:" +res);
	}
	public static void main(String... args)
	{
		Parallelogram P1 = new Parallelogram();
		P1.area();
	}
}
