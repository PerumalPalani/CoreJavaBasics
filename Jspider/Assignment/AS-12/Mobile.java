class Mobile
{
	double cost;
	String M_colour;
	static String M_name = "M-33 Samsung";
	public static void main(String args[])
	{
		System.out.println("the Mobile name is:" +M_name);
		Mobile m1 = new Mobile();
		m1.cost = 10000;
		m1.M_colour = "Purple";
		System.out.println(m1.M_colour+ "is price as" +m1.cost);
		m1.cost = 15000;
		m1.M_colour = "Shine_black";
		System.out.println(m1.M_colour+ "is price as" +m1.cost);
		Mobile m2 = new Mobile();
		m2.cost = 25000;
		m2.M_colour = "Shine_white";
		System.out.println(m2.M_colour+ "is pric as" +m2.cost);
	}
}