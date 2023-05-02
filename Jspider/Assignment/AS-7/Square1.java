class Square
{
	static void area(int a)
	{
		int res = a*a;
		System.out.println("The area of square is:" +res);
	}
}
class Square1
{
	public static void main(String args[])
	{
		Square.area(9);
	}
}