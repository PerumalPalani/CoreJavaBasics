class Amazon
{
	static void signup()
	{
		System.out.println("signup");
	}
	public static void main(String args[])
	{
		System.out.println("...Welcome to the Amazon..");
		signup();
		login();
		home_page();
		order();
		logout();
		System.out.println(".. Thank you for using Amazon..");
	}
	static void login()
	{
		System.out.println("Login");
	}
	static void home_page()
	{
		System.out.println("Home_page");
	}
	static void order()
	{
		System.out.println("Order");
	}
	static void logout()
	{
		System.out.println("logout");
	}
}