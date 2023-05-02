class Parallelogram
{
	static int area(int b, int h)
	{
		int res = b*h;
		return res;
	}
}
class Parallelogram1
{
	public static void main(String args[])
	{
		int x = Parallelogram.area(12, 14);
		System.out.println("The area of Parallelogram is:" +x);
	}
}