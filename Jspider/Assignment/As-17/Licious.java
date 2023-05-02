class Former
{
	void meat()
	{
		System.out.println("It is meat or goat area");
	}
}
class Licious
{
	public static void main(String args[])
	{
		Former f1 = new Former();
		Customer1.cus1(f1);
		Customer2.cus2(f1);
	}
}
class Customer1
{
	static void cus1(Former f2)
	{
		f2.meat();
	}
}
class Customer2
{
	static void cus2(Former f3)
	{
		f3.meat();
	}
}