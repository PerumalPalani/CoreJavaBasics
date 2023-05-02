class Sector
{
	void area()
	{
		int r = 10;
		int ti = 15;
		double res = (r*r*ti)/2.0;
		System.out.println("the area of Sector is" +res);
	}
}
class Sector1
{
	public static void main(String args[])
	{
		Sector s = new Sector();
		s.area();
	}
}