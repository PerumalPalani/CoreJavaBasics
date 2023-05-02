class Tester3
{
	int r = 4;
	void disp()
	{
		final double pi = 3.14;
		double res = pi*r*r;
		System.out.println("Results is:" +res);
	}
}
class Tista1 extends Tester3
{
	void uliya()
	{
		System.out.println("Hello World!");
	}
}
class Tength
{
	public static void main(String args[])
	{
		Tester3  t1 = new Tista1();
		System.out.println("Values:" +(t1.r));
		t1.disp();
		Tista1 t2 = (Tista1) t1;
		System.out.println("values:" +(t2.r));
		t2.disp();
		t2. uliya();
	}
}
