class Sector
{
	static double area(int r, int b)
	{
		double res = (r*r*b)/2;
		return res;
	}
}
class Sector1
{
	public static void main(String args[])
	{
		double x = Sector.area(15, 90);
		System.out.println("The area of Sector is:" +x);
	}
}