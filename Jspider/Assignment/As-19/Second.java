class Sample
{
	void disp()
	{
		System.out.println("Hello world:");
	}
}
class Ambules extends Sample
{
	void tata()
	{
		System.out.println("Hello Java:");
	}
}
class Second
{
	public static void main(String args[])
	{
		Sample s1 = new Ambules();
		s1.disp();
		Ambules a1 = (Ambules) s1;
		a1.disp();
		a1.tata();		
	}
}