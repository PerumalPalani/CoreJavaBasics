class Sector
{
	static double area()
	{
		int r = 5;
		int a = 6;
		double res = (r*r*a)/2;
		return res;
	}
	public static void main(String args[])
	{
		double x = area();
		System.out.println("The area of Sector is:" +x);
	}
}
	
