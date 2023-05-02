class Sample21
{
	void ho()
	{
		System.out.println("Hello java!");
	}
	int r = 45;
}
class Hahoha extends Sample21
{
	void disp()
	{
		System.out.println("Welcome to all!");
	}
}
class Thirteenth
{
	public static void main(String args[])
	{
		Sample21 s1 = new Hahoha();
		s1.ho();
		System.out.println("Values:" +(s1.r));
		Hahoha s2 = (Hahoha) s1;
		s2.ho();
		System.out.println("Values:" +(s2.r));
		s2.disp();	
	}
}
