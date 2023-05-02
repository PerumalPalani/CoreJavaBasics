class ZestMoney
{
	static void signup()
	{
		System.out.println("Siging up the ZestMoney");
	}
	static void login()
	{
		System.out.println("login the page of ZestMoney");
	}
	static void homepage()
	{
		System.out.println("homepage is the ZestMoney");
	}
	public static void main(String args[])
	{
		System.out.println("...Welcome to ZestMoney..");
		signup();
		login();
		homepage();
		logout();
		System.out.println("...Thank you for using ZestMoney..");
	}
	static void logout()
	{
		System.out.println("Logout the ZestMoney");
	}
}