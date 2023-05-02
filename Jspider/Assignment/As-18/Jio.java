class Mart
{
	static void deliver(int no)
	{
		System.out.println("Number of:" +no);
	}
	static void deliver(String name)
	{
		System.out.println("Enter the name:" +name);
	}
	static void deliver(int no, String name)
	{
		System.out.println("Number of:"+no+"\t Enter the name:" +name);
	}
	static void deliver(String name, int no)
	{
		System.out.println("Enter the name:" +name+ "\t Number of:"+no);
	}
}
class Jio
{
	public static void main(String args[])
	{
		Mart.deliver(5);
		Mart.deliver("vegetable");
		Mart.deliver(10, "vegetable");
		Mart.deliver("Vegetable", 20);
	}
}