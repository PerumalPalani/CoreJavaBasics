public class Xerox implements Cloneable
{
protected Object clone() throws CloneNotSupportedException
{
return super.clone();
}
String str="this is for testing object creation methods";
public static void main(String ars[]) {
Xerox obj1=new Xerox();
try {
Xerox obj2=(Xerox) obj1.clone();
System.out.println(obj2.str);
}
catch(CloneNotSupportedException e) {
e.printStackTrace();
}
}
}