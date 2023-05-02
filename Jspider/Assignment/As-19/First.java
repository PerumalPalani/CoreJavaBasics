class Demo
{
	int x = 25;
}
class Pemocha extends Demo
{
	void ho()
	{
		int b = 20;
		int c = 15;
		int e = b*c;
		System.out.println("The result of:" +e);
	}
}
class First
{
	public static void main(String args[])
	{
		Demo d1 = new Pemocha();
		System.out.println("Print the value:" +(d1.x));
		Pemocha p1 = (Pemocha) d1;
		System.out.println("Print the vlaues:" +(p1.x));
		p1.ho();
	}
}