class Car
{
	double cost;
	String c_model;
	static String c_type = "Petrol/Disel";
	public static void main(String args[])
	{
		System.out.println("The car type is:" +c_type);
		Car c1 = new Car();
		c1.c_model = "Netrogen";
		c1.cost = 500000;
		System.out.println(c1.c_model+ "Price is:" +c1.cost);
		Car c2 = new Car();
		c2.c_model = "Honda robo";
		c2.cost = 6000000;
		System.out.println(c2.c_model+ "Price is:" +c2.cost);
	}
}
