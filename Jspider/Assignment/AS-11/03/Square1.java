class Square
{
	int area()
	{
		int a = 17;
		int res = a*a;
		return res;
	}
}
class Square1
{
	public static void main(String args[])
	{
		Square s = new Square();
		int c = s.area();
		System.out.println("the area of square is:" +c);
	}
}