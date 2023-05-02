class Sector
{
	void area(int r, int ti)
	{
		double res = (r*r*ti)/2.0;
		System.out.println("the area of Sector is;" +res);
	}
}
class Sector1
{
	public static void main(String args[])
	{
		Sector s = new Sector();
		s.area(16, 19);
	}
}