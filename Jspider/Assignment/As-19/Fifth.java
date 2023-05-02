class Demo1
{
	double z = 100.90;
}
class Dumtaka extends Demo1
{
	int x = 100;
}
class Fifth
{
	public static void main(String args[])
	{
		Demo1 d1 = new Dumtaka();
		System.out.println("Print the values:" +(d1.z));
		Dumtaka d2 = (Dumtaka) d1;
		System.out.println("Print the values:" +(d2.z));
		System.out.println("Println the values:" +(d2.x));
	}
}