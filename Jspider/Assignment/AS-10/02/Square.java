class Square
{
	void area(int a)
	{
		int res = a*a;
		System.out.println("the area of Square is:" +res);
	}
	public static void main(String args[])
	{
		Square s1 = new Square();
		s1.area(15);
	}
}