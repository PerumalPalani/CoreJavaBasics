class Triangle
{
	double area()
	{
		int b = 10;
		int h = 12;
		double res = (b*h)/2.0;
		return res;
	}
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();
		double x = t1.area();
		System.out.println("the area of Triagle is:" +x);
	}
}