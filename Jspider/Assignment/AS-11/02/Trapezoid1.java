class Trapezoid
{
	void area(int a, int b, int h)
	{
		double res = ((a+b)*h)/2.0;
		System.out.println("the area of Trapezoid is:" +res);
	}
}
class Trapezoid1
{
	public static void main(String args[])
	{
		Trapezoid t = new Trapezoid();
		t.area(7, 8, 10);
	}
}