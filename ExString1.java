public class ExString1 {
public static void main(String args[]) {
String s1 = "PERUMAL";
String s2 = new String("perumal");
String s3 = "PERUMAL";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1 == s3);
System.out.println(s1 == s2);
System.out.println(s1.compareTo(s3));
System.out.println(s3.compareTo(s1));
StringBuilder s4 = new StringBuilder("Hello");
StringBuilder s5 = new StringBuilder("Welcome");
StringBuilder s6 = s4.append(s5);
System.out.println(s6.toString());
String s7= String.format("%s %s" ,s4,s5);
System.out.println(s7.toString());
String s8= String.join("" ,s4,s5);
System.out.println(s8.toString());
}
}