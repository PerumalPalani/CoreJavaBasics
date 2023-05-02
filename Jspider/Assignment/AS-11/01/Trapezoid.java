class Trapezoid1
{
	void area()
	{
		int a = 15; 
		int b = 16;
		int h = 8;
		double res = ((a+b)*h)/2.0;
		System.out.println("the area of Trapezoid:" +res);
	}
}
class Trapezoid
{
	public static void main(String args[])
	{
		Trapezoid1 t1 = new Trapezoid1();
		t1.area();
	}
}