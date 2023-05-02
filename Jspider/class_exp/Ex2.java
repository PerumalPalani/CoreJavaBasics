class Ex1
{
	int d = 60;
	void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("the value of C is:" +c);
	}
}
class Ex2
{
	public static void main(String args[])
	{
		new Ex1().mul(6, 8);
		System.out.println(" the value of D is" +new Ex1().d);
	}
}