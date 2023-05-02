class Square
{
	void area()
	{
		int a = 15;
		int res = a*a;
		System.out.println("The area of Square is:" +res);
	}
	public static void main(String... args)
	{
		Square S1 = new Square();
		S1.area();
	}
}