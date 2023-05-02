public class StudentEx1 {
int roll_no;
String name;
String clg;
StudentEx1(int roll_no, String name, String clg) {
this.roll_no = roll_no;
this.name = name;
this.clg = clg;
}
public String toString() {
return roll_no+""+name+""+clg;
}
public static void main(String args[]) {
StudentEx1 s1 = new StudentEx1(100002, "Perumal", "Podhigai");
StudentEx1 s2 = new StudentEx1(100005, "Perumal01", "College");
StudentEx1 s3 = new StudentEx1(100010, "Perumal03", "Engineering");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
}
}