class Apple
{
	int d = 50;
}
class Ball extends Apple
{
	void fruit()
	{
		int f = 10;
		int g = 15;
		int i = f*g;
		System.out.println("Print thr result:" +i);
	}
}
class Cat
{
	public static void main(String args[])
	{
		Apple a1 = new Ball();
		System.out.println("Print the value:" +(a1.d));
		Ball b1 = (Ball) a1;
		System.out.println("Print the value:" +(b1.d));
		b1.fruit();

	}
}