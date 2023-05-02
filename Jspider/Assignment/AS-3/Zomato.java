class Zomato
{
	static void signup()
	{
		System.out.println("Signup the Zomato");
	}
	static void login()
	{
		System.out.println("Enter your user name and password:");
	}
	static void home_page()
	{
		System.out.println("This is the home page");
	}
	public static void main(String args[])
	{
		System.out.println("Well come to the Zomato");
		signup();
		login();
		home_page();
		order();
		logout();
		System.out.println("Thank you for using Zomato:");
	}
	static void order()
	{
		System.out.println("Order the food");
	}
	static void logout()
	{
		System.out.println("Logout the zomato");
	}
}