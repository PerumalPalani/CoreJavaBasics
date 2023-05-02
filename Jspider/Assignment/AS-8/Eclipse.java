class Eclipse1
{
	static double area(int a, int b)
	{
		final double pi = 3.142;
		double res = 2*(pi*a*b);
		return res;
	}
}
class Eclipse
{
	public static void main(String args[])
	{
		double x = Eclipse1.area(16, 20);
		System.out.println("the area of Eclipse is:" +x);
	}
}