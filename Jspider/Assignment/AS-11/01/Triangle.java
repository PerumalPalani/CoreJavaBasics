class Triangle1
{
	void area()
	{
		int b = 10;
		int h = 20;
		double res = (b*h)/2.0;
		System.out.println("the area of triangle is:" +res);
	}
}
class Triangle
{
	public static void main(String args[])
	{
		Triangle1 t1 = new Triangle1();
		t1.area();
	}
}