public class Your {
void show() {
System.out.println("the object is");
}
public static void main(String args[]) {
try {
Class cls=Class.forName("This is object1");
Your obj=(Your) cls.newInstance();
obj.show();
}
catch (ClassNotFoundException e) {
e.printStackTrace();
}

catch (InstantiationException e) {
e.printStackTrace();
}
catch (IllegalAccessException e) {
e.printStackTrace();
}
}
}

