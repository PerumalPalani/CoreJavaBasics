class Tester
{
	int r = 18;
}
class Tista extends Tester
{
	void uliya()
	{
		System.out.println("Hello java:");
	}
}
class Third
{
	public static void main(String args[])
	{
		Tester t1 = new Tista();
		System.out.println("The value of r is:" +(t1.r));
		Tista t2 = (Tista) t1;
		System.out.println("The value of r is:" +(t2.r));
		t2.uliya();
	}
}