class Phone
{
	void payment()
	{
		System.out.println("the payment");
	}
}
class Phone_v1 extends Phone
{
	void payment()
	{
		System.out.println("the payment and chart");
	}

}
class Phone1
{
	public static void main(String args[])
	{
		Phone_v1 p1 = new Phone_v1();
		p1.payment();
	}
}