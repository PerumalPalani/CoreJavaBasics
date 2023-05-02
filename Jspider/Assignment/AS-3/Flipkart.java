class Flipkart
{
	static void signup()
	{
		System.out.println("Signup the page");
	}
	static void login()
	{
		System.out.println("Login the page");
	}
	public static void main(String args[])
	{
		System.out.println("...welcome to Flipkart..");
		signup();
		login();
		home_page();
		order();
		logout();
		System.out.println("...Thank you for using Flipkart..");
	}
	static void home_page()
	{
		System.out.println("this is a home page");
	}
	static void order()
	{
		System.out.println("Something order in Flipkart");
	}
	static void logout()
	{
		System.out.println("This is logouting the page");
	}
}
