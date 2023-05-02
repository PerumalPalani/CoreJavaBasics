import java.util.Scanner;
class Block1
{

	static int a;
	static {
	System.out.println("It is SIB" +a);
	}
	{
		System.out.println(" It is IIB");
	}
	Block1()
	{
		System.out.println("Hey i am constructor");
	}
	public static void main(String args[])
	{
		System.out.println(".....Main Starts...");
		new Block1();
		System.out.println("....Main Ends...");
	}
}