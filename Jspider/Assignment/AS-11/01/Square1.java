class Square
{
	void area()
	{
		int a = 15;
		int res = a*a;
		System.out.println("the area of square is:" +res);
	}
}
class Square1
{
	public static void main(String args[])
	{
		Square s = new Square();
		s.area();
	}
}
