class Show
{
	static void book(int no)
	{
		System.out.println("Number of seats:" +no);
	}
	static void book(String name)
	{
		System.out.println("Enter the movie name:" +name);
	}
	static void book(int no, String name)
	{
		System.out.println("Number of seats:"+no+"\t Enter the movie name:" +name);
	}
	static void book(String name, int no)
	{
		System.out.println("Enter the movie name:" +name+ "\t Number of seats:"+no);
	}
}
class BookMyShow
{
	public static void main(String args[])
	{
		Show.book(10);
		Show.book("Vikram");
		Show.book(10, "Beast");
		Show.book("Beast", 20);
	}
}