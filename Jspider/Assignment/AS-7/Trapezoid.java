class Trape
{
	static double area(int a, int b, int h)
	{
		double res=0.5*(a+b)*h;
		return res;
	}
}
class Trapezoid
{
	public static void main(String args[])
	{
		double x= Trape.area(5,6,9);
		System.out.println("The trapezoid area of:" +x);
	}

}