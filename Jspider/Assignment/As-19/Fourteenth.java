class Cola13
{
	int f = 58;
	void disp()
	{
		System.out.println("this is java program");
	}
}
class Chungacha extends Cola13
{
	int d = 89;
}
class Fourteenth
{
	public static void main(String args[])
	{
		Cola13 c1 = new Chungacha();
		System.out.println("Values:" +(c1.f));
		c1.disp();
		Chungacha c2 = (Chungacha) c1;
		System.out.println("Values:" +(c2.f));
		c2.disp();
		System.out.println("Values:" +(c2.d));
	}
}