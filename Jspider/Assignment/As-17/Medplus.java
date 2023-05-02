class Medicine
{
	void medicines()
	{
		System.out.println("All types of medicines factory");
	}
}
class Medplus
{
	public static void main(String args[])
	{
		Medicine m1 = new Medicine();
		Patient1.needmedi(m1);
		Patient2.needmedi(m1);
	}
}
class Patient1
{
	static void needmedi(Medicine m2) 
	{
		m2.medicines();
	}
}
class Patient2
{
	static void needmedi(Medicine m3)
	{
		m3.medicines();
	}
}