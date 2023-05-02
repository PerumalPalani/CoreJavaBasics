class Square 
{
	static int area(int a)
	{
		int res = a*a;
		return res;
	}

}
class Square1
{
	public static void main(String args[])
	{
		int x = Square.area(22);
		System.out.println("The area of square is:" +x);
	}
}