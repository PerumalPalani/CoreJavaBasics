import java.lang.reflect.*;
public class ObjectCreation {
private String str;
ObjectCreation() {
}
public void setName(String str)
{
this.str =str;
}
public static void main(String args[]) {
try {
Constructor<ObjectCreation> constructor=ObjectCreation.class.getDeclaredConstructor();
ObjectCreation a=constructor.newInstance();
a.setName("A java creation");
System.out.println(a.str);
}
catch (Exception e) {
e.printStackTrace();
}
}
}