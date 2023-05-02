class Electronics_company
{
	void e_product()
	{
		System.out.println("All the electronics devices available here");
	}
}
class Olx
{
	public static void main(String args[])
	{
		Electronics_company f1 = new Electronics_company();
		Customer1.device1(f1);
		Customer2.device2(f1);

	}
}
class Customer1
{
	static void device1(Electronics_company f2)
	{
		f2.e_product();

	}
}
class Customer2
{
	static void device2(Electronics_company f3)
	{
		f3.e_product();
	}
}