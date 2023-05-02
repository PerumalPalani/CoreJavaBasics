class Vehicle
{
	void Two_Wheeler()
	{
		
		System.out.println("It is good two wheeler");
	}
}
class Software
{
	public static void main(String args[])
	{
		Vehicle v1 = new Vehicle();
		Demo1.purchase1(v1);
		Demo2.purchase2(v1);
	}
}
class Demo1
{
	static void purchase1(Vehicle v2)
	{
		v2.Two_Wheeler();

	}
}
class Demo2
{
	static void purchase2(Vehicle v3)
	{
		v3.Two_Wheeler();
	}
}