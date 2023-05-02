class Cool
{
	void add()
	{
		int a = 29;
		int b = 30;
		int c = a+b;
		System.out.println("Result is:" +c);
	}
}
class Goolata extends Cool
{
	void dispu()
	{
		int d = 20;
		int e = 5;
		int f = d*e;
		System.out.println("Multiply res:" +f);
	}
}

class Fourth
{
	public static void main(String args[])
	{
		Cool c1 = new Goolata();
		c1.add();
		Goolata g1 = (Goolata) c1;
		g1.add();
		g1.dispu();
	}
}
