class Sector
{
	void area()
	{
		int r = 39;
		int a = 40;
		double res = (r*r*a)/2;
		System.out.println("The area of Sector is:" + res);
	}
	public static void main(String args[])
	{
		new Sector().area();
	}
}