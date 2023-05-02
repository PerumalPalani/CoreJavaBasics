class Sector
{
	void area(int r, int ti)
	{
		double res = (r*r*ti)/2.0;
		System.out.println("The area of Sector is:" +res);
	}
	public static void main(String args[])
	{
		Sector s1 = new Sector();
		s1.area(8, 10);
	}
}
