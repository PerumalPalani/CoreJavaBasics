class Mobile
{
	double m_cost;
	String m_name;
	String m_colour;
	Mobile(double x, String y, String z)
	{
		m_cost = x;
		m_name = y;
		m_colour = z;
	}
	public static void main(String args[])
	{
		Mobile m = new Mobile(15000, "Samsung", "Purple");
		System.out.println(m.m_cost);
		System.out.println(m.m_name);
		System.out.println(m.m_colour);
	}
}
