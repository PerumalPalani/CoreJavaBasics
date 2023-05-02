class Cool4
{
	void add()
	{
		int a = 8;
		int b = 58;
		int c = a+b;
		System.out.println("Results:" +c);
	}
}
class Goolata2 extends Cool4
{
	int r =15;
	void dispu()
	{
		final double pi = 3.14;
		double res = pi*r*r;
		System.out.println("Result:" +res);
	}
}
class Elevength
{
	public static void main(String args[])
	{
		Cool4 c1 = new Goolata2();
		c1.add();
		Goolata2 c2 = (Goolata2) c1;
		c2.add();
		System.out.println("Values are:" +(c2.r));
		c2.dispu();
	}
}