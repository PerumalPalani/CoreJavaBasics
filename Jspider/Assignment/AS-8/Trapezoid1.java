class Trapezoid 
{
	static double area(int a, int b, int h)
	{
		double res = ((a+b)*h)/2;
		return res;
	}
}
class Trapezoid1
{
	public static void main(String args[])
	{
		double x = Trapezoid.area(9, 12, 13);
		System.out.println("The area of Tapezoid is" +x);
	}
}