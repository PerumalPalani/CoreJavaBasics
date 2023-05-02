public class ObjectEx1 implements Cloneable
{
int rool_no;
String name;
ObjectEx1(int rool_no, String name) {
this.rool_no = rool_no;
this.name = name;
}
public Object clone() throws CloneNotSupportedException {
return super.clone();
}
public static void main(String args[]) {
try {
ObjectEx1 s1 = new ObjectEx1(1001, "Perumal");
ObjectEx1 s2 = (ObjectEx1)s1.clone();
System.out.println(s1.rool_no+ "\n" +s1.name);
System.out.println(s2.rool_no+ "\n" +s2.name);
}
catch (CloneNotSupportedException c) {}
}
}
