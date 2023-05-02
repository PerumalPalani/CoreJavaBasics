class Sector
{
	double area()
	{
		int r = 10;
		int ti = 16;
		double res = (r*r*ti)/2.0;
		return res;
	}
}
class Sector1
{
	public static void main(String args[])
	{
		Sector s = new Sector();
		double p = s.area();
		System.out.println("the area of Sector is:" +p);
	}
}