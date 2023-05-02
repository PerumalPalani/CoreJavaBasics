class Hotel
{
	void food()
	{
		System.out.println("The Veg-briyani");
	}
}
class Swiggy
{
	public static void main(String args[])
	{
		Hotel f1 = new Hotel();
		Customer1.needfood1(f1);
		Customer2.needfood2(f1);

	}
}
class Customer1
{
	static void needfood1(Hotel f2)
	{
		f2.food();

	}
}
class Customer2
{
	static void needfood2(Hotel f3)
	{
		f3.food();
	}
}