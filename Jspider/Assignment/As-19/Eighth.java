class Tester1
{
	int x = 10;
	void disp()
	{
		int y = 5;
		int w = x*y;
		System.out.println("Results:" +w);
	}
}
class Huliyacha extends Tester1
{
	void ho()
	{
		System.out.println("Hello world!");
	}
}
class Eighth
{
	public static void main(String args[])
	{
		Tester1 t1 = new Huliyacha();
		System.out.println("Values:" +(t1.x));
		t1.disp();
		Huliyacha t2 = (Huliyacha) t1;
		System.out.println("Values:" +(t2.x));
		t2.disp();
		t2.ho();		
	}
}