class Eclipse
{
	void area()
	{
		final double pi= 3.142;
		int a = 7;
		int b = 8;
		double res = pi*a*b;
		System.out.println("The area of Eclipse is:" +res);
	}
	public static void main(String... args)
	{
		Eclipse E1 = new Eclipse();
		E1.area();
	}
}