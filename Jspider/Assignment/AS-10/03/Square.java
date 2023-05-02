class Square
{
	int area()
	{
		int a = 15;
		int res = a*a;
		return res;
	}
	public static void main(String args[])
	{
		Square s1 = new Square();
		int x = s1.area();
		System.out.println("The area of Square is:" +x);
	}
}
