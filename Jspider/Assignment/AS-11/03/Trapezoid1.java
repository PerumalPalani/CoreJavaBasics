class Trapezoid
{
	double area()
	{
		int a = 15;
		int b = 16;
		int h = 16;
		double res = ((a+b)*h)/2.0;
		return res;
	}
}
class Trapezoid1
{
	public static void main(String args[])
	{
		Trapezoid t = new Trapezoid();
		double z = t.area();
		System.out.println("the area of Trapezoid is:" +z);
	}

}