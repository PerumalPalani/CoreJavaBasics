class Load
{
	static void load(int no)
	{
		System.out.println("Number of loads:" +no);
	}
	static void load(String text)
	{
		System.out.println("Type of load:" +text);
	}
	static void load(int no, String text)
	{
		System.out.println("Number of load:"+no+"\t Type of load:" +text);
	}
	static void load(String text, int no)
	{
		System.out.println("Type of load:" +text+ "\t Number of load:"+no);
	}
}
class Porter
{
	public static void main(String args[])
	{
		Load.load(5);
		Load.load("Steal");
		Load.load(10, "Cement");
		Load.load("Rock", 20);
	}
}