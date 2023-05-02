class Eclipse
{
	static double area()
	{
		final double pi = 3.142d;
		int a = 5;
		int b = 6;
		double res = pi*a*b;
		return res;
	}
	public static void main(String args[])
	{
		double d = area();
		System.out.println("The area of Eclipse is:" +d);
	}
}