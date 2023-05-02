class Sample2
{
	void co()
	{
		System.out.println("Hello Google:");
	}
}
class Guleyluu extends Sample2
{
	void disp()
	{
		System.out.println("Hi google:");
	}
}
class Sixth
{
	public static void main(String args[])
	{
		Sample2 s1 = new Guleyluu();
		s1.co();
		Guleyluu g1 = (Guleyluu) s1;
		g1.co();
		g1.disp();
	}
}