class Sector
{
	double area()
	{
		int r = 15;
		int ti = 16;
		double res = (r*r*ti)/2.0;
		return res;
	}
	public static void main(String args[])
	{
		Sector s1 = new Sector();
		double x = s1.area();
		System.out.println("the area of Sector is:" +x);
	}
}