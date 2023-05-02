class Tester
{
	int a = 10;
}
class Demo extends Tester
{
	void test()
	{
		int b = 10;
		int c = 20;
		int d = b+c;
		System.out.println("The result value is:" +d);
	}
}
class Firs01
{
	public static void main(String args[])
	{
		Tester t1 = (Tester) new Demo();
		System.out.println("print super class:" +(t1.a));
		Demo d1 = (Demo) t1;
		System.out.println("Print Super_class:" +(d1.a));
		d1.test(); 
	}
}