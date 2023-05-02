class Sect
{
	static void area()
	{
		int r = 16;
		double a = 30.6d;
		double res = (r*r*a)/2;
		System.out.println("The area of Sector is:" +res);
	}
}
class Sector
{
	public static void main(String args[])
	{
		Sect.area();
	}
}