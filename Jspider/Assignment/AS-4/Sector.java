class Sector
{
	static void area(int r, double b)
	{
		double res =(r*r*b)/2;
		System.out.println("The area of Sector is:" +res);
	}
	public static void main(String args[])
	{
		area(5, 10.5);
	}
}
	