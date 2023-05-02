class Sector
{
	void area()
	{
		int r = 9;
		int ti = 10;
		double res = (r*r*ti)/2.0;
		System.out.println("the area of sector is:" +res);
	}
	public static void main(String... args)
	{
		Sector S1 = new Sector();
		S1.area();
	}
}
