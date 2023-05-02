class Sector
{
	static void area(int r, int b)
	{
		double res = (r*r*b)/2;
		System.out.println("The area of Circle is" +res);
	}

}
class Sector1
{
	public static void main(String args[])
	{
		Sector.area(15, 16);
	}
}