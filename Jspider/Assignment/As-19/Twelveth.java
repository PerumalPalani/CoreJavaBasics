class Demo10
{
	double z = 56.25;
	int r = 15;
}
class Dumtaka3 extends Demo10
{
	int x =58;
}
class Twelveth
{
	public static void main(String args[])
	{
		Demo10 d1 = new Dumtaka3();
		System.out.println("The values:" +(d1.z));
		System.out.println("the values:" +(d1.r));
		Dumtaka3 d2 = (Dumtaka3) d1;
		System.out.println("The values:" +(d2.z));
		System.out.println("the values:" +(d2.r));
		System.out.println("The values:" +(d2.x));
	}
}