class Cool2
{
	void disp()
	{
		System.out.println("HELLO!");
	}
}
class Dinga extends Cool2
{
	int x = 9;
	void tata()
	{
		int y = 10;
		int m = x*y;
		System.out.println("Results:" +m);
	}
}
class Nineth
{
	public static void main(String args[])
	{
		Cool2 c1 = new Dinga();
		c1.disp();
		Dinga d1 = (Dinga) c1;
		d1.disp();
		System.out.println("values:" +(d1.x));
		d1.tata();
	}
}