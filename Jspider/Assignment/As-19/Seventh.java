class Cola1
{
	int f = 50;
}
class Chungacha extends Cola1
{
	int d = 100;
}
class Seventh
{
	public static void main(String args[])
	{
		Cola1 c1 = new Chungacha();
		System.out.println("Print the result:" +(c1.f));
		Chungacha c2 = (Chungacha) c1;
		System.out.println("Print the values:" +(c2.f));
		System.out.println("Print the values:" +(c2.d));
	}
}