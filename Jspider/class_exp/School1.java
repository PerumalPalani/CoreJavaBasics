class School1
{
	
	String s_name;
	int s_strength;
	char s_grade;
	School1(String s_name, int s_strength, char s_grade)
	{
		this.s_name = s_name;
		this.s_strength = s_strength;
		this.s_grade = s_grade;
	}
	public static void main(String args[])
	{
		School1 s = new School1("St.joseph's", 1000, 'A');
		System.out.println(s.s_name);
		System.out.println(s.s_strength);
		System.out.println(s.s_grade);
		
	}
}