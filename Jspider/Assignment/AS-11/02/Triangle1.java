class Triangle
{
	void area(int b, int h)
	{
		double res = (b*h)/2.0;
		System.out.println("the area of triangle is:" +res);
	}
}
class Triangle1
{
	public static void main(String args[])
	{
		Triangle t = new Triangle();
		t.area(16, 17);
	}
}