class School
{
	static String s_name = "St.joseph's highersecondary school";
	char s_grade;
	int s_strength;
	public static void main(String args[])
	{
		System.out.println("the school name is:" +s_name);
		School s = new School();
		s.s_grade = 'A';
		s.s_strength = 300;
		System.out.println("School grade is:" +s.s_grade+ "Strength:" +s.s_strength);
		s.s_grade = 'D';
		s.s_strength = 1000;
		System.out.println("School grade is:" +s.s_grade+ "Strength:" +s.s_strength);
	}
}
